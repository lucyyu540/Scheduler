import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.*; 

public class LabTwo {
	static int[] randomNumbers;

	public static void main(String args[]) throws FileNotFoundException {
		int arguments = args.length;
		String inputFileName = args[arguments -1];
		//String inputFileName = "input-5";
		boolean detail = false; //normal
		//detail = true; //TEST
		
		if (arguments > 1) {
			detail = true; //detailed
		}
		
		//test
		
		int[][] input = readInput(inputFileName);
		randomNumbers = listOutRandomNumbers();
		
		for (int alg = 0; alg < 4; alg ++) {
			Scheduler sch = new Scheduler(input);
			executeScheduler(sch, detail, alg);
		}
		
		
		
		//Scheduler sch = new Scheduler(input);
		//executeScheduler(sch,detail,2);
		
		
	}

	//helper
	public static void printDetailed(Scheduler sch) {
		System.out.println("This detailed printout gives the state and remaining burst for each process");
		for (int i = 0 ; i < sch.cycles.size() ; i ++) {
			String s = "Before cycle " + i + ": ";
			String[][] cycle = sch.cycles.get(i);
			for (String[] process : cycle) {
				String state = process[0]; String burst = process[1];
				s += state + " - " + burst + "\t";
			}
			System.out.println(s);
		}
	}
	//helper
	public static int randomOS(int U, int[] randoms) {
		int index = (int)(Math.random()*100000); //
		int X = randoms[index];
		return 1 + X%U;
	}
	//***********************************************************************

	//1. read files
	public static int[][] readInput(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scn = new Scanner(file);
		int num = scn.nextInt();
		int[][] summary = new int[num][4];
		for (int i = 0 ; i < num ; i ++) {
			for (int j = 0; j < 4; j ++) {
				summary[i][j] = scn.nextInt();
			}
		}
		scn.close();
		return summary;
	}
	//2. retrieve the random numbers
	public static int[] listOutRandomNumbers() throws FileNotFoundException {
		File file = new File("random-numbers.txt");
		Scanner scn = new Scanner(file);
		int [] numbers = new int[100000];
		int i = 0;
		while (scn.hasNextInt()) {
			numbers[i] = scn.nextInt();
			i ++;
		}
		scn.close();
		return numbers;
	}

	//***********************************************************************
	//3. scheduling algorithms
	static void executeScheduler(Scheduler sch, boolean detail, int alg) {
		System.out.print("Original input: ");
		sch.printOrder(sch.processes);
		System.out.print("(Sorted) input: ");
		sch.printOrder(sch.summary);
		int cycle = 0;
		while(sch.queue.size() != 0 || sch.blocked.size() != 0 || sch.unstarted.size() != 0) {//sth needs to be processed
			sch.updateCycle();
			if (alg == 0) {sch.executeFCFS(cycle);}
			else if (alg == 1) {sch.executeRR(cycle); }
			else if (alg == 3) {sch.executeSJF(cycle);}
			else if (alg ==2) {sch.executeUNI(cycle);}
			cycle ++;
			}
		if (alg == 0) {System.out.println("FCFS scheduling algorithm used." );}
		else if (alg == 1) {System.out.println("RR scheduling algorithm used.");}
		else if (alg == 3) {System.out.println("SJF scheduling algorithm used.");}
		else if (alg == 2) {System.out.println("UNI scheduling algorithm used.");}
		
		if (detail) {
			printDetailed(sch);
		}
		sch.printSummary();	
	}
	
		

	
	//***********************************************************************
	
	static class Scheduler{
		int numberOfProcesses;
		ArrayList<Process> processes = new ArrayList<Process>(); //original
		ArrayList<Process> queue = new ArrayList<Process> (); //sorted
		ArrayList<Process> blocked = new ArrayList<Process> ();
		ArrayList<Process> unstarted = new ArrayList<Process> ();
		ArrayList<Process> summary = new ArrayList<Process> (); //sorted and fixed
		ArrayList<Process> uniRunOrder = new ArrayList<Process> ();
		ArrayList<String[][]> cycles = new ArrayList<String[][]> ();
		
		ArrayList<Process> temp = new ArrayList<Process> ();//temp
		ArrayList<Process> moveToBlocked = new ArrayList<Process> ();//temp
		
		//constructor
		Scheduler(int[][] input) {
			this.numberOfProcesses = input.length;
			for (int i = 0 ; i < input.length; i ++) {
				int A = input[i][0];
				int B = input[i][1];
				int C = input[i][2];
				int IO = input[i][3];
				Process process = new Process(A, B, C, IO);
				this.unstarted.add(process);//sort this later
				this.processes.add(process);//original
			}
			
			Collections.sort(unstarted, new Comparator<Process>() { 
				public int compare(Process p1, Process p2)
				{return p1.A - p2.A;}});
			
			for (Process p : unstarted) {
				this.summary.add(p);
				p.id = unstarted.indexOf(p); 
				this.uniRunOrder.add(p);
			}
		}

		//0
		void executeFCFS(int cycle) {
			//=====================first in queue=======================================
			if (this.queue.size() > 0) {
				this.queue.get(0).executeRunning(this, cycle);
			}
			for (Process p : this.temp) {
				this.queue.remove(p);
			}
			this.temp.clear();
			//=====================the rest in queue=======================================
			for (Process p : this.queue) {
				p.executeReady(this, cycle);
			}

			//=====================in blocked=======================================
			for (Process p : this.blocked) {
				p.executeBlocked(this, cycle);
			}
			for (Process p : this.temp) {
				this.blocked.remove(p);
			}
			this.temp.clear();
			for (Process p : this.moveToBlocked) {
				this.blocked.add(p); 
			}
			this.moveToBlocked.clear();
			//=======================in unstarted=====================================
			for (Process p : this.unstarted) {
				p.executeUnstarted(this, cycle);		
			}
			for (Process p : this.temp) {
				this.unstarted.remove(p);
			}
			this.temp.clear();
			//============================================================
		}
		//1
		void executeRR(int cycle) {
			executeFCFS(cycle);
			for (Process p : this.queue) {
				if (p.burst > 2) {
					p.burst = 2;
				}
			}
		}
		
		
		//2
		public void executeSJF(int cycle) {
			//sort queue in order of [C - cpu] = time left
			Collections.sort(this.queue, new Comparator<Process>() { 
				public int compare(Process p1, Process p2)
				{return (p1.C-p1.cpu) - (p2.C - p2.cpu);}});
			executeFCFS(cycle);

		}




		public void executeUNI(int cycle) {
			//the order of uniprogramming execution 
			//1) only run 'now/
			//2) only block 'now'
			Process now = this.uniRunOrder.get(0);
	
			/**
			 * executeRunning()
			 * running --> blocked (--> moveToBlocked --> blocked)
			 * running --> terminated (just deleted from queue)
			 */
			//=====================first in queue=======================================
			if (this.queue.size() > 0) { //if queue exists 
				if (this.queue.get(0).equals(now))  { //if first in line == now
					this.queue.get(0).executeRunning(this, cycle); //run it
					//3 possible states of 'now':
					//1) blocked, 2) terminated, 3)running 
					if (this.queue.get(0).state.equals("terminated")) {
						this.uniRunOrder.remove(this.queue.get(0)); //if it has terminated	
						if (this.uniRunOrder.size() > 0) {//still processes left
							now = this.uniRunOrder.get(0); //get new 'now'
						}
					}
				}
			}
			for (Process p : this.temp) {
				this.queue.remove(p); //this process has been blocked or terminated
			}
			this.temp.clear();
			/**
			 * executeReady()
			 * ready --> running if first in queue
			 * 
			 * */
			//=====================the rest in queue=======================================
			for (Process p : this.queue) {
				p.executeReady(this, cycle); 
				if (!p.equals(now)) {//make sure that even if it is first in queue, it is not processed. 
					p.state = "ready";
					p.burst = 0;
				}
			}
			/**
			 * execute Blocked()
			 * blocked --> running if nothing in queue
			 * blcoked --> ready if sth in queue
			 * 
			 * */
			//=====================in blocked========only 'now' blocked because it is the only process run=======================
			for (Process p : this.blocked) {
				p.executeBlocked(this, cycle);
				
			}
			for (Process p : this.temp) { //'now' has been moved to running
				this.blocked.remove(p);
				
				if (p.equals(now)) {//'move it from end --> front of the queue
					this.queue.remove(p);
					this.queue.add(0, p);
					p.state = "running";
					p.burst = randomOS(p.B, randomNumbers);
				}
			}
			this.temp.clear();
			for (Process p : this.moveToBlocked) {//process that running --> blocked
				this.blocked.add(p); 
			}
			this.moveToBlocked.clear();
			/**
			 * executeUnstarted()
			 * unstarted --> running if nothing in queue
			 * unstarted --> ready if sth in queue
			 * 
			 * */
			//=======================in unstarted=====================================
			for (Process p : this.unstarted) {
				p.executeUnstarted(this, cycle);
				if (!p.equals(now)) {
					p.state = "ready";
					p.burst = 0;
				}
			}
			for (Process p : this.temp) {
				this.unstarted.remove(p);
			}
			this.temp.clear();
			//============================================================
		}
		

		void updateCycle() {
			String[][] states = new String[this.numberOfProcesses][2];
			for (int i = 0 ; i < this.summary.size() ; i ++) {
				Process thisProcess = this.summary.get(i);
				String state = thisProcess.state;
				int burst = thisProcess.burst; //for display
				states[i][0] = state;
				states[i][1] = burst + "";

			}
		
			this.cycles.add(states);
		}
		
		//helper
		void printOrder(ArrayList<Process> order) {
			String s = this.numberOfProcesses + " ";
			for (Process p : order) {
				s += p.A + " " ;
				s += p.B + " ";
				s += p.C + " ";
				s += p.IO + " ";
			}
			System.out.println(s);
		}
		//helper
		
		void printSummary() {
			for (Process p:this.summary) {
				p.printProcessSummary();
			}
			int totalRunning = 0;
			int totalBlocked = 0;
			int totalTurnaround = 0;
			int totalWaiting = 0;
			int finish = this.cycles.size();
			for (Process p : this.summary) {
				totalRunning += p.C;
				totalBlocked += p.ioT;
				totalTurnaround += p.turnAroundT;
				totalWaiting += p.waitingT;
			}
			float cpuUt = ((float)totalRunning*100)/finish;
			float ioUt = ((float)totalBlocked*100) / finish;
			float throughput = (this.numberOfProcesses*100/(float)finish);
			float avTurnaround = (float)totalTurnaround/this.numberOfProcesses;
			float avWaiting = (float)totalWaiting/this.numberOfProcesses;
			System.out.println("Summary Data: " );
			System.out.println("CPU Utilization: " + cpuUt + "%");
			System.out.println("I/O Utilization: " + ioUt + "%");
			System.out.println("Throughput: " + throughput);
			System.out.println("Average tunraround time: " + avTurnaround);
			System.out.println("Average waiting time: " + avWaiting);
		}
		
	
		
		
	}
	
	//***********************************************************************

	static class Process {
		int id; int A; int B; int C; int IO;
		int finishingT = 0 ; int turnAroundT = 0; 
		int ioT = 0 ; int waitingT = 0;
		String state;
		int burst = 0; 
		int cpu = 0;
		boolean allowedToRun = false;
	
		Process(int A, int B, int C, int IO) {
			this.A = A;
			this.B = B;
			this.C = C;
			this.IO = IO;	
			state = "unstarted";
		}
		
		//helper
		void printProcessSummary() {
			System.out.printf("Process %d:\n", id);
			System.out.printf("\t(A,B,C,IO) = (%d,%d,%d,%d)\n", this.A, this.B, this.C, this.IO);
			System.out.printf("\tFinishing time: %d\n", this.finishingT);
			System.out.printf("\tTurnaround time: %d\n", this.turnAroundT);
			System.out.printf("\tI/O time: %d\n", this.ioT);
			System.out.printf("\tWaiting time: %d\n", this.waitingT);
		}

		void executeRunning(Scheduler sch, int cycle) {	
			this.cpu += 1;
			this.burst -= 1;

			if(this.burst == 0 && this.cpu < this.C) { //block it
				this.state = "blocked";
				this.burst = randomOS(this.IO, randomNumbers);
				sch.temp.add(this); //to delete from qeue
				sch.moveToBlocked.add(this);
				//sch.queue.remove(this);
			}
			else if (cpu == this.C){ //terminate
				this.state = "terminated";
				this.finishingT = cycle;
				this.turnAroundT = this.finishingT - this.A;
				this.burst = 0;
				sch.temp.add(this);
				//sch.queue.remove(this);
			}
			//else remains running 
		}
		void executeReady(Scheduler sch, int cycle) {
			//if it becomes the first in line after execution of current process
			if (this.equals(sch.queue.get(0)) && this.state.equals("ready")) { //happens only if it becomes first in queue
				this.state = "running";
				this.burst = randomOS(this.B, randomNumbers);
			}
			
			if (this.state.equals("ready")) {
				this.waitingT += 1;
			}
			
			
		}

		void executeBlocked(Scheduler sch, int cycle) {
			this.burst -= 1;
			this.ioT += 1; 
			if (this.burst == 0) { //move it to the queue
				if (sch.queue.size() == 0 ) {//need to start running
					this.burst = randomOS(this.B, randomNumbers); 
					this.state = "running";
				}
				else {//need to wait
					this.burst = 0;
					this.state = "ready";

				}
				sch.queue.add(this);	
				sch.temp.add(this);
				//sch.blocked.remove(this);
			}
		}
		
		void executeUnstarted(Scheduler sch, int cycle) {
			if(cycle  == this.A) {//move to queue
				if (sch.queue.size()==0) {//run it
					this.state = "running";
					this.burst = randomOS(this.B, randomNumbers);
				}
				else {// make it wait
					this.state = "ready"; 
					this.burst = 0;
					this.waitingT += 1;
				}
				sch.queue.add(this);
				sch.temp.add(this);
				//sch.unstarted.remove(this); concurrentmod error lol	
			}
		}
		
	
	}
	
	
	
}
