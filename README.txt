# Scheduler

to compile:
javac LabTwo.java


to run:
java LabTwo --verbose <filename>


Example run on input-5:
NON DETAILED VERSIONS
Lucys-MBP-4:src lucyyu540$ javac LabTwo.java
Lucys-MBP-4:src lucyyu540$ java LabTwo input-5
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
	at LabTwo.main(LabTwo.java:11)
Lucys-MBP-4:src lucyyu540$ javac LabTwo.java
Lucys-MBP-4:src lucyyu540$ java LabTwo input-5
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
FCFS scheduling algorithm used.
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 88
	Turnaround time: 88
	I/O time: 22
	Waiting time: 26
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 90
	Turnaround time: 89
	I/O time: 17
	Waiting time: 32
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 86
	Turnaround time: 85
	I/O time: 19
	Waiting time: 28
Summary Data: 
CPU Utilization: 98.9011%
I/O Utilization: 63.736263%
Throughput: 3.2967033
Average tunraround time: 87.333336
Average waiting time: 28.666666
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
RR scheduling algorithm used.
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 83
	Turnaround time: 83
	I/O time: 34
	Waiting time: 8
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 87
	Turnaround time: 86
	I/O time: 32
	Waiting time: 10
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 92
	Turnaround time: 91
	I/O time: 42
	Waiting time: 10
Summary Data: 
CPU Utilization: 96.77419%
I/O Utilization: 116.129036%
Throughput: 3.2258065
Average tunraround time: 86.666664
Average waiting time: 9.333333
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
UNI scheduling algorithm used.
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 44
	Turnaround time: 44
	I/O time: 14
	Waiting time: 0
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 94
	Turnaround time: 93
	I/O time: 20
	Waiting time: 20
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 151
	Turnaround time: 150
	I/O time: 27
	Waiting time: 64
Summary Data: 
CPU Utilization: 59.210526%
I/O Utilization: 40.13158%
Throughput: 1.9736842
Average tunraround time: 95.666664
Average waiting time: 28.0
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
SJF scheduling algorithm used.
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 41
	Turnaround time: 41
	I/O time: 11
	Waiting time: 0
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 69
	Turnaround time: 68
	I/O time: 12
	Waiting time: 4
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 107
	Turnaround time: 106
	I/O time: 19
	Waiting time: 8
Summary Data: 
CPU Utilization: 83.333336%
I/O Utilization: 38.88889%
Throughput: 2.7777777
Average tunraround time: 71.666664
Average waiting time: 4.0




DETAILED VERSION
Lucys-MBP-4:src lucyyu540$ java LabTwo --verbose input-5
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
FCFS scheduling algorithm used.
This detailed printout gives the state and remaining burst for each process
Before cycle 0: unstarted - 0	unstarted - 0	unstarted - 0	
Before cycle 1: running - 3	unstarted - 0	unstarted - 0	
Before cycle 2: running - 2	ready - 0	ready - 0	
Before cycle 3: running - 1	ready - 0	ready - 0	
Before cycle 4: blocked - 1	running - 3	ready - 0	
Before cycle 5: ready - 0	running - 2	ready - 0	
Before cycle 6: ready - 0	running - 1	ready - 0	
Before cycle 7: ready - 0	blocked - 2	running - 4	
Before cycle 8: ready - 0	blocked - 1	running - 3	
Before cycle 9: ready - 0	ready - 0	running - 2	
Before cycle 10: ready - 0	ready - 0	running - 1	
Before cycle 11: running - 5	ready - 0	blocked - 2	
Before cycle 12: running - 4	ready - 0	blocked - 1	
Before cycle 13: running - 3	ready - 0	ready - 0	
Before cycle 14: running - 2	ready - 0	ready - 0	
Before cycle 15: running - 1	ready - 0	ready - 0	
Before cycle 16: blocked - 1	running - 3	ready - 0	
Before cycle 17: ready - 0	running - 2	ready - 0	
Before cycle 18: ready - 0	running - 1	ready - 0	
Before cycle 19: ready - 0	blocked - 2	running - 4	
Before cycle 20: ready - 0	blocked - 1	running - 3	
Before cycle 21: ready - 0	ready - 0	running - 2	
Before cycle 22: ready - 0	ready - 0	running - 1	
Before cycle 23: running - 4	ready - 0	blocked - 3	
Before cycle 24: running - 3	ready - 0	blocked - 2	
Before cycle 25: running - 2	ready - 0	blocked - 1	
Before cycle 26: running - 1	ready - 0	ready - 0	
Before cycle 27: blocked - 1	running - 1	ready - 0	
Before cycle 28: ready - 0	blocked - 1	running - 1	
Before cycle 29: running - 4	ready - 0	blocked - 4	
Before cycle 30: running - 3	ready - 0	blocked - 3	
Before cycle 31: running - 2	ready - 0	blocked - 2	
Before cycle 32: running - 1	ready - 0	blocked - 1	
Before cycle 33: blocked - 1	running - 5	ready - 0	
Before cycle 34: ready - 0	running - 4	ready - 0	
Before cycle 35: ready - 0	running - 3	ready - 0	
Before cycle 36: ready - 0	running - 2	ready - 0	
Before cycle 37: ready - 0	running - 1	ready - 0	
Before cycle 38: ready - 0	blocked - 2	running - 3	
Before cycle 39: ready - 0	blocked - 1	running - 2	
Before cycle 40: ready - 0	ready - 0	running - 1	
Before cycle 41: running - 5	ready - 0	blocked - 3	
Before cycle 42: running - 4	ready - 0	blocked - 2	
Before cycle 43: running - 3	ready - 0	blocked - 1	
Before cycle 44: running - 2	ready - 0	ready - 0	
Before cycle 45: running - 1	ready - 0	ready - 0	
Before cycle 46: blocked - 1	running - 3	ready - 0	
Before cycle 47: ready - 0	running - 2	ready - 0	
Before cycle 48: ready - 0	running - 1	ready - 0	
Before cycle 49: ready - 0	blocked - 3	running - 4	
Before cycle 50: ready - 0	blocked - 2	running - 3	
Before cycle 51: ready - 0	blocked - 1	running - 2	
Before cycle 52: ready - 0	ready - 0	running - 1	
Before cycle 53: running - 5	ready - 0	blocked - 1	
Before cycle 54: running - 4	ready - 0	ready - 0	
Before cycle 55: running - 3	ready - 0	ready - 0	
Before cycle 56: running - 2	ready - 0	ready - 0	
Before cycle 57: running - 1	ready - 0	ready - 0	
Before cycle 58: blocked - 2	running - 2	ready - 0	
Before cycle 59: blocked - 1	running - 1	ready - 0	
Before cycle 60: ready - 0	blocked - 2	running - 3	
Before cycle 61: ready - 0	blocked - 1	running - 2	
Before cycle 62: ready - 0	ready - 0	running - 1	
Before cycle 63: running - 2	ready - 0	blocked - 2	
Before cycle 64: running - 1	ready - 0	blocked - 1	
Before cycle 65: blocked - 2	running - 1	ready - 0	
Before cycle 66: blocked - 1	blocked - 1	running - 5	
Before cycle 67: ready - 0	ready - 0	running - 4	
Before cycle 68: ready - 0	ready - 0	running - 3	
Before cycle 69: ready - 0	ready - 0	running - 2	
Before cycle 70: ready - 0	ready - 0	running - 1	
Before cycle 71: running - 3	ready - 0	blocked - 4	
Before cycle 72: running - 2	ready - 0	blocked - 3	
Before cycle 73: terminated - 0	running - 5	blocked - 2	
Before cycle 74: terminated - 0	running - 4	blocked - 1	
Before cycle 75: terminated - 0	running - 3	ready - 0	
Before cycle 76: terminated - 0	running - 2	ready - 0	
Before cycle 77: terminated - 0	running - 1	ready - 0	
Before cycle 78: terminated - 0	blocked - 3	running - 5	
Before cycle 79: terminated - 0	blocked - 2	running - 4	
Before cycle 80: terminated - 0	blocked - 1	running - 3	
Before cycle 81: terminated - 0	ready - 0	running - 2	
Before cycle 82: terminated - 0	ready - 0	running - 1	
Before cycle 83: terminated - 0	running - 5	blocked - 2	
Before cycle 84: terminated - 0	running - 4	blocked - 1	
Before cycle 85: terminated - 0	running - 3	ready - 0	
Before cycle 86: terminated - 0	running - 2	ready - 0	
Before cycle 87: terminated - 0	running - 1	ready - 0	
Before cycle 88: terminated - 0	blocked - 3	running - 3	
Before cycle 89: terminated - 0	blocked - 2	terminated - 0	
Before cycle 90: terminated - 0	blocked - 1	terminated - 0	
Before cycle 91: terminated - 0	running - 3	terminated - 0	
Before cycle 92: terminated - 0	running - 2	terminated - 0	
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 72
	Turnaround time: 72
	I/O time: 9
	Waiting time: 26
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 92
	Turnaround time: 91
	I/O time: 19
	Waiting time: 34
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 88
	Turnaround time: 87
	I/O time: 21
	Waiting time: 28
Summary Data: 
CPU Utilization: 96.77419%
I/O Utilization: 52.68817%
Throughput: 3.2258065
Average tunraround time: 83.333336
Average waiting time: 29.333334
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
RR scheduling algorithm used.
This detailed printout gives the state and remaining burst for each process
Before cycle 0: unstarted - 0	unstarted - 0	unstarted - 0	
Before cycle 1: running - 2	unstarted - 0	unstarted - 0	
Before cycle 2: running - 1	ready - 0	ready - 0	
Before cycle 3: blocked - 1	running - 2	ready - 0	
Before cycle 4: ready - 0	running - 1	ready - 0	
Before cycle 5: ready - 0	blocked - 1	running - 2	
Before cycle 6: ready - 0	ready - 0	running - 1	
Before cycle 7: running - 1	ready - 0	blocked - 3	
Before cycle 8: blocked - 1	running - 2	blocked - 2	
Before cycle 9: ready - 0	running - 1	blocked - 1	
Before cycle 10: running - 2	blocked - 1	ready - 0	
Before cycle 11: running - 1	ready - 0	ready - 0	
Before cycle 12: blocked - 3	ready - 0	running - 2	
Before cycle 13: blocked - 2	ready - 0	running - 1	
Before cycle 14: blocked - 1	running - 2	blocked - 3	
Before cycle 15: ready - 0	running - 1	blocked - 2	
Before cycle 16: running - 1	blocked - 2	blocked - 1	
Before cycle 17: blocked - 3	blocked - 1	running - 1	
Before cycle 18: blocked - 2	running - 1	blocked - 2	
Before cycle 19: blocked - 1	blocked - 2	blocked - 1	
Before cycle 20: running - 2	blocked - 1	ready - 0	
Before cycle 21: running - 1	ready - 0	ready - 0	
Before cycle 22: blocked - 1	ready - 0	running - 2	
Before cycle 23: ready - 0	ready - 0	running - 1	
Before cycle 24: ready - 0	running - 2	blocked - 2	
Before cycle 25: ready - 0	running - 1	blocked - 1	
Before cycle 26: running - 2	blocked - 2	ready - 0	
Before cycle 27: running - 1	blocked - 1	ready - 0	
Before cycle 28: blocked - 3	ready - 0	running - 1	
Before cycle 29: blocked - 2	running - 1	blocked - 3	
Before cycle 30: blocked - 1	blocked - 3	blocked - 2	
Before cycle 31: running - 1	blocked - 2	blocked - 1	
Before cycle 32: blocked - 2	blocked - 1	running - 2	
Before cycle 33: blocked - 1	ready - 0	running - 1	
Before cycle 34: ready - 0	running - 1	blocked - 2	
Before cycle 35: running - 2	blocked - 3	blocked - 1	
Before cycle 36: running - 1	blocked - 2	ready - 0	
Before cycle 37: blocked - 2	blocked - 1	running - 1	
Before cycle 38: blocked - 1	running - 2	blocked - 4	
Before cycle 39: ready - 0	running - 1	blocked - 3	
Before cycle 40: running - 1	blocked - 1	blocked - 2	
Before cycle 41: blocked - 3	running - 2	blocked - 1	
Before cycle 42: blocked - 2	running - 1	ready - 0	
Before cycle 43: blocked - 1	blocked - 1	running - 2	
Before cycle 44: ready - 0	ready - 0	running - 1	
Before cycle 45: running - 2	ready - 0	blocked - 4	
Before cycle 46: running - 1	ready - 0	blocked - 3	
Before cycle 47: blocked - 3	running - 2	blocked - 2	
Before cycle 48: blocked - 2	running - 1	blocked - 1	
Before cycle 49: blocked - 1	blocked - 1	running - 2	
Before cycle 50: ready - 0	ready - 0	running - 1	
Before cycle 51: running - 2	ready - 0	blocked - 2	
Before cycle 52: running - 1	ready - 0	blocked - 1	
Before cycle 53: blocked - 3	running - 1	ready - 0	
Before cycle 54: blocked - 2	blocked - 3	running - 1	
Before cycle 55: blocked - 1	blocked - 2	blocked - 1	
Before cycle 56: running - 2	blocked - 1	ready - 0	
Before cycle 57: running - 1	ready - 0	ready - 0	
Before cycle 58: blocked - 1	ready - 0	running - 2	
Before cycle 59: ready - 0	ready - 0	running - 1	
Before cycle 60: ready - 0	running - 2	blocked - 1	
Before cycle 61: ready - 0	running - 1	ready - 0	
Before cycle 62: running - 2	blocked - 1	ready - 0	
Before cycle 63: running - 1	ready - 0	ready - 0	
Before cycle 64: blocked - 3	ready - 0	running - 1	
Before cycle 65: blocked - 2	running - 1	blocked - 1	
Before cycle 66: blocked - 1	blocked - 1	running - 2	
Before cycle 67: ready - 0	ready - 0	running - 1	
Before cycle 68: running - 1	ready - 0	blocked - 2	
Before cycle 69: blocked - 1	running - 2	blocked - 1	
Before cycle 70: ready - 0	running - 1	ready - 0	
Before cycle 71: ready - 0	blocked - 3	running - 2	
Before cycle 72: ready - 0	blocked - 2	running - 1	
Before cycle 73: running - 1	blocked - 1	blocked - 3	
Before cycle 74: blocked - 2	running - 2	blocked - 2	
Before cycle 75: blocked - 1	running - 1	blocked - 1	
Before cycle 76: ready - 0	blocked - 1	running - 2	
Before cycle 77: ready - 0	ready - 0	running - 1	
Before cycle 78: running - 2	ready - 0	blocked - 2	
Before cycle 79: running - 1	ready - 0	blocked - 1	
Before cycle 80: blocked - 1	running - 2	ready - 0	
Before cycle 81: ready - 0	running - 1	ready - 0	
Before cycle 82: ready - 0	blocked - 1	running - 1	
Before cycle 83: running - 2	ready - 0	blocked - 1	
Before cycle 84: running - 1	ready - 0	ready - 0	
Before cycle 85: blocked - 3	running - 2	ready - 0	
Before cycle 86: blocked - 2	running - 1	ready - 0	
Before cycle 87: blocked - 1	blocked - 1	running - 2	
Before cycle 88: ready - 0	ready - 0	running - 1	
Before cycle 89: running - 2	ready - 0	blocked - 1	
Before cycle 90: running - 1	ready - 0	ready - 0	
Before cycle 91: terminated - 0	running - 2	ready - 0	
Before cycle 92: terminated - 0	terminated - 0	running - 2	
Before cycle 93: terminated - 0	terminated - 0	running - 1	
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 90
	Turnaround time: 90
	I/O time: 36
	Waiting time: 10
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 91
	Turnaround time: 90
	I/O time: 28
	Waiting time: 19
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 93
	Turnaround time: 92
	I/O time: 37
	Waiting time: 13
Summary Data: 
CPU Utilization: 95.74468%
I/O Utilization: 107.44681%
Throughput: 3.1914895
Average tunraround time: 90.666664
Average waiting time: 14.0
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
UNI scheduling algorithm used.
This detailed printout gives the state and remaining burst for each process
Before cycle 0: unstarted - 0	unstarted - 0	unstarted - 0	
Before cycle 1: running - 1	ready - 0	ready - 0	
Before cycle 2: blocked - 3	ready - 0	ready - 0	
Before cycle 3: blocked - 2	ready - 0	ready - 0	
Before cycle 4: blocked - 1	ready - 0	ready - 0	
Before cycle 5: running - 4	ready - 0	ready - 0	
Before cycle 6: running - 3	ready - 0	ready - 0	
Before cycle 7: running - 2	ready - 0	ready - 0	
Before cycle 8: running - 1	ready - 0	ready - 0	
Before cycle 9: blocked - 3	ready - 0	ready - 0	
Before cycle 10: blocked - 2	ready - 0	ready - 0	
Before cycle 11: blocked - 1	ready - 0	ready - 0	
Before cycle 12: running - 5	ready - 0	ready - 0	
Before cycle 13: running - 4	ready - 0	ready - 0	
Before cycle 14: running - 3	ready - 0	ready - 0	
Before cycle 15: running - 2	ready - 0	ready - 0	
Before cycle 16: running - 1	ready - 0	ready - 0	
Before cycle 17: blocked - 3	ready - 0	ready - 0	
Before cycle 18: blocked - 2	ready - 0	ready - 0	
Before cycle 19: blocked - 1	ready - 0	ready - 0	
Before cycle 20: running - 4	ready - 0	ready - 0	
Before cycle 21: running - 3	ready - 0	ready - 0	
Before cycle 22: running - 2	ready - 0	ready - 0	
Before cycle 23: running - 1	ready - 0	ready - 0	
Before cycle 24: blocked - 1	ready - 0	ready - 0	
Before cycle 25: running - 1	ready - 0	ready - 0	
Before cycle 26: blocked - 3	ready - 0	ready - 0	
Before cycle 27: blocked - 2	ready - 0	ready - 0	
Before cycle 28: blocked - 1	ready - 0	ready - 0	
Before cycle 29: running - 3	ready - 0	ready - 0	
Before cycle 30: running - 2	ready - 0	ready - 0	
Before cycle 31: running - 1	ready - 0	ready - 0	
Before cycle 32: blocked - 2	ready - 0	ready - 0	
Before cycle 33: blocked - 1	ready - 0	ready - 0	
Before cycle 34: running - 5	ready - 0	ready - 0	
Before cycle 35: running - 4	ready - 0	ready - 0	
Before cycle 36: running - 3	ready - 0	ready - 0	
Before cycle 37: running - 2	ready - 0	ready - 0	
Before cycle 38: running - 1	ready - 0	ready - 0	
Before cycle 39: blocked - 3	ready - 0	ready - 0	
Before cycle 40: blocked - 2	ready - 0	ready - 0	
Before cycle 41: blocked - 1	ready - 0	ready - 0	
Before cycle 42: running - 5	ready - 0	ready - 0	
Before cycle 43: running - 4	ready - 0	ready - 0	
Before cycle 44: running - 3	ready - 0	ready - 0	
Before cycle 45: running - 2	ready - 0	ready - 0	
Before cycle 46: running - 1	ready - 0	ready - 0	
Before cycle 47: blocked - 1	ready - 0	ready - 0	
Before cycle 48: running - 3	ready - 0	ready - 0	
Before cycle 49: running - 2	ready - 0	ready - 0	
Before cycle 50: terminated - 0	running - 3	ready - 0	
Before cycle 51: terminated - 0	running - 2	ready - 0	
Before cycle 52: terminated - 0	running - 1	ready - 0	
Before cycle 53: terminated - 0	blocked - 2	ready - 0	
Before cycle 54: terminated - 0	blocked - 1	ready - 0	
Before cycle 55: terminated - 0	running - 1	ready - 0	
Before cycle 56: terminated - 0	blocked - 2	ready - 0	
Before cycle 57: terminated - 0	blocked - 1	ready - 0	
Before cycle 58: terminated - 0	running - 1	ready - 0	
Before cycle 59: terminated - 0	blocked - 2	ready - 0	
Before cycle 60: terminated - 0	blocked - 1	ready - 0	
Before cycle 61: terminated - 0	running - 3	ready - 0	
Before cycle 62: terminated - 0	running - 2	ready - 0	
Before cycle 63: terminated - 0	running - 1	ready - 0	
Before cycle 64: terminated - 0	blocked - 1	ready - 0	
Before cycle 65: terminated - 0	running - 4	ready - 0	
Before cycle 66: terminated - 0	running - 3	ready - 0	
Before cycle 67: terminated - 0	running - 2	ready - 0	
Before cycle 68: terminated - 0	running - 1	ready - 0	
Before cycle 69: terminated - 0	blocked - 3	ready - 0	
Before cycle 70: terminated - 0	blocked - 2	ready - 0	
Before cycle 71: terminated - 0	blocked - 1	ready - 0	
Before cycle 72: terminated - 0	running - 5	ready - 0	
Before cycle 73: terminated - 0	running - 4	ready - 0	
Before cycle 74: terminated - 0	running - 3	ready - 0	
Before cycle 75: terminated - 0	running - 2	ready - 0	
Before cycle 76: terminated - 0	running - 1	ready - 0	
Before cycle 77: terminated - 0	blocked - 2	ready - 0	
Before cycle 78: terminated - 0	blocked - 1	ready - 0	
Before cycle 79: terminated - 0	running - 5	ready - 0	
Before cycle 80: terminated - 0	running - 4	ready - 0	
Before cycle 81: terminated - 0	running - 3	ready - 0	
Before cycle 82: terminated - 0	running - 2	ready - 0	
Before cycle 83: terminated - 0	running - 1	ready - 0	
Before cycle 84: terminated - 0	blocked - 1	ready - 0	
Before cycle 85: terminated - 0	running - 2	ready - 0	
Before cycle 86: terminated - 0	running - 1	ready - 0	
Before cycle 87: terminated - 0	blocked - 3	ready - 0	
Before cycle 88: terminated - 0	blocked - 2	ready - 0	
Before cycle 89: terminated - 0	blocked - 1	ready - 0	
Before cycle 90: terminated - 0	running - 2	ready - 0	
Before cycle 91: terminated - 0	running - 1	ready - 0	
Before cycle 92: terminated - 0	blocked - 3	ready - 0	
Before cycle 93: terminated - 0	blocked - 2	ready - 0	
Before cycle 94: terminated - 0	blocked - 1	ready - 0	
Before cycle 95: terminated - 0	running - 3	ready - 0	
Before cycle 96: terminated - 0	running - 2	ready - 0	
Before cycle 97: terminated - 0	running - 1	ready - 0	
Before cycle 98: terminated - 0	blocked - 2	ready - 0	
Before cycle 99: terminated - 0	blocked - 1	ready - 0	
Before cycle 100: terminated - 0	running - 1	ready - 0	
Before cycle 101: terminated - 0	terminated - 0	running - 5	
Before cycle 102: terminated - 0	terminated - 0	running - 4	
Before cycle 103: terminated - 0	terminated - 0	running - 3	
Before cycle 104: terminated - 0	terminated - 0	running - 2	
Before cycle 105: terminated - 0	terminated - 0	running - 1	
Before cycle 106: terminated - 0	terminated - 0	blocked - 2	
Before cycle 107: terminated - 0	terminated - 0	blocked - 1	
Before cycle 108: terminated - 0	terminated - 0	running - 1	
Before cycle 109: terminated - 0	terminated - 0	blocked - 4	
Before cycle 110: terminated - 0	terminated - 0	blocked - 3	
Before cycle 111: terminated - 0	terminated - 0	blocked - 2	
Before cycle 112: terminated - 0	terminated - 0	blocked - 1	
Before cycle 113: terminated - 0	terminated - 0	running - 1	
Before cycle 114: terminated - 0	terminated - 0	blocked - 1	
Before cycle 115: terminated - 0	terminated - 0	running - 1	
Before cycle 116: terminated - 0	terminated - 0	blocked - 4	
Before cycle 117: terminated - 0	terminated - 0	blocked - 3	
Before cycle 118: terminated - 0	terminated - 0	blocked - 2	
Before cycle 119: terminated - 0	terminated - 0	blocked - 1	
Before cycle 120: terminated - 0	terminated - 0	running - 2	
Before cycle 121: terminated - 0	terminated - 0	running - 1	
Before cycle 122: terminated - 0	terminated - 0	blocked - 2	
Before cycle 123: terminated - 0	terminated - 0	blocked - 1	
Before cycle 124: terminated - 0	terminated - 0	running - 3	
Before cycle 125: terminated - 0	terminated - 0	running - 2	
Before cycle 126: terminated - 0	terminated - 0	running - 1	
Before cycle 127: terminated - 0	terminated - 0	blocked - 1	
Before cycle 128: terminated - 0	terminated - 0	running - 5	
Before cycle 129: terminated - 0	terminated - 0	running - 4	
Before cycle 130: terminated - 0	terminated - 0	running - 3	
Before cycle 131: terminated - 0	terminated - 0	running - 2	
Before cycle 132: terminated - 0	terminated - 0	running - 1	
Before cycle 133: terminated - 0	terminated - 0	blocked - 4	
Before cycle 134: terminated - 0	terminated - 0	blocked - 3	
Before cycle 135: terminated - 0	terminated - 0	blocked - 2	
Before cycle 136: terminated - 0	terminated - 0	blocked - 1	
Before cycle 137: terminated - 0	terminated - 0	running - 1	
Before cycle 138: terminated - 0	terminated - 0	blocked - 3	
Before cycle 139: terminated - 0	terminated - 0	blocked - 2	
Before cycle 140: terminated - 0	terminated - 0	blocked - 1	
Before cycle 141: terminated - 0	terminated - 0	running - 3	
Before cycle 142: terminated - 0	terminated - 0	running - 2	
Before cycle 143: terminated - 0	terminated - 0	running - 1	
Before cycle 144: terminated - 0	terminated - 0	blocked - 3	
Before cycle 145: terminated - 0	terminated - 0	blocked - 2	
Before cycle 146: terminated - 0	terminated - 0	blocked - 1	
Before cycle 147: terminated - 0	terminated - 0	running - 3	
Before cycle 148: terminated - 0	terminated - 0	running - 2	
Before cycle 149: terminated - 0	terminated - 0	running - 1	
Before cycle 150: terminated - 0	terminated - 0	blocked - 4	
Before cycle 151: terminated - 0	terminated - 0	blocked - 3	
Before cycle 152: terminated - 0	terminated - 0	blocked - 2	
Before cycle 153: terminated - 0	terminated - 0	blocked - 1	
Before cycle 154: terminated - 0	terminated - 0	running - 3	
Before cycle 155: terminated - 0	terminated - 0	running - 2	
Before cycle 156: terminated - 0	terminated - 0	running - 1	
Before cycle 157: terminated - 0	terminated - 0	blocked - 1	
Before cycle 158: terminated - 0	terminated - 0	running - 3	
Before cycle 159: terminated - 0	terminated - 0	running - 2	
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 49
	Turnaround time: 49
	I/O time: 19
	Waiting time: 0
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 100
	Turnaround time: 99
	I/O time: 21
	Waiting time: 21
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 159
	Turnaround time: 158
	I/O time: 29
	Waiting time: 68
Summary Data: 
CPU Utilization: 56.25%
I/O Utilization: 43.125%
Throughput: 1.875
Average tunraround time: 102.0
Average waiting time: 29.666666
Original input: 3 1 5 30 3 1 5 30 4 0 5 30 3 
(Sorted) input: 3 0 5 30 3 1 5 30 3 1 5 30 4 
SJF scheduling algorithm used.
This detailed printout gives the state and remaining burst for each process
Before cycle 0: unstarted - 0	unstarted - 0	unstarted - 0	
Before cycle 1: running - 4	unstarted - 0	unstarted - 0	
Before cycle 2: running - 3	ready - 0	ready - 0	
Before cycle 3: running - 2	ready - 0	ready - 0	
Before cycle 4: running - 1	ready - 0	ready - 0	
Before cycle 5: blocked - 3	running - 4	ready - 0	
Before cycle 6: blocked - 2	running - 3	ready - 0	
Before cycle 7: blocked - 1	running - 2	ready - 0	
Before cycle 8: ready - 0	running - 1	ready - 0	
Before cycle 9: running - 4	running - 1	ready - 0	
Before cycle 10: running - 3	running - 1	ready - 0	
Before cycle 11: running - 2	running - 1	ready - 0	
Before cycle 12: running - 1	running - 1	ready - 0	
Before cycle 13: blocked - 3	running - 1	ready - 0	
Before cycle 14: blocked - 2	blocked - 1	running - 5	
Before cycle 15: blocked - 1	ready - 0	running - 4	
Before cycle 16: ready - 0	running - 4	running - 4	
Before cycle 17: running - 1	running - 4	running - 4	
Before cycle 18: blocked - 1	running - 4	running - 4	
Before cycle 19: ready - 0	running - 3	running - 4	
Before cycle 20: running - 4	running - 3	running - 4	
Before cycle 21: running - 3	running - 3	running - 4	
Before cycle 22: running - 2	running - 3	running - 4	
Before cycle 23: running - 1	running - 3	running - 4	
Before cycle 24: blocked - 3	running - 3	running - 4	
Before cycle 25: blocked - 2	running - 2	running - 4	
Before cycle 26: blocked - 1	running - 1	running - 4	
Before cycle 27: ready - 0	blocked - 3	running - 4	
Before cycle 28: running - 4	blocked - 2	running - 4	
Before cycle 29: running - 3	blocked - 1	running - 4	
Before cycle 30: running - 2	ready - 0	running - 4	
Before cycle 31: running - 1	ready - 0	running - 4	
Before cycle 32: blocked - 2	running - 4	running - 4	
Before cycle 33: blocked - 1	running - 3	running - 4	
Before cycle 34: ready - 0	running - 2	running - 4	
Before cycle 35: running - 5	running - 2	running - 4	
Before cycle 36: running - 4	running - 2	running - 4	
Before cycle 37: running - 3	running - 2	running - 4	
Before cycle 38: running - 2	running - 2	running - 4	
Before cycle 39: running - 1	running - 2	running - 4	
Before cycle 40: blocked - 3	running - 2	running - 4	
Before cycle 41: blocked - 2	running - 1	running - 4	
Before cycle 42: blocked - 1	blocked - 1	running - 4	
Before cycle 43: ready - 0	ready - 0	running - 3	
Before cycle 44: running - 1	ready - 0	running - 3	
Before cycle 45: blocked - 1	running - 5	running - 3	
Before cycle 46: ready - 0	running - 4	running - 3	
Before cycle 47: terminated - 0	running - 4	running - 3	
Before cycle 48: terminated - 0	running - 3	running - 3	
Before cycle 49: terminated - 0	running - 2	running - 3	
Before cycle 50: terminated - 0	running - 1	running - 3	
Before cycle 51: terminated - 0	blocked - 1	running - 3	
Before cycle 52: terminated - 0	ready - 0	running - 2	
Before cycle 53: terminated - 0	running - 5	running - 2	
Before cycle 54: terminated - 0	running - 4	running - 2	
Before cycle 55: terminated - 0	running - 3	running - 2	
Before cycle 56: terminated - 0	running - 2	running - 2	
Before cycle 57: terminated - 0	running - 1	running - 2	
Before cycle 58: terminated - 0	blocked - 3	running - 2	
Before cycle 59: terminated - 0	blocked - 2	running - 1	
Before cycle 60: terminated - 0	blocked - 1	blocked - 2	
Before cycle 61: terminated - 0	running - 2	blocked - 1	
Before cycle 62: terminated - 0	running - 1	ready - 0	
Before cycle 63: terminated - 0	blocked - 2	running - 5	
Before cycle 64: terminated - 0	blocked - 1	running - 4	
Before cycle 65: terminated - 0	ready - 0	running - 3	
Before cycle 66: terminated - 0	running - 1	running - 3	
Before cycle 67: terminated - 0	blocked - 3	running - 3	
Before cycle 68: terminated - 0	blocked - 2	running - 2	
Before cycle 69: terminated - 0	blocked - 1	running - 1	
Before cycle 70: terminated - 0	running - 1	blocked - 4	
Before cycle 71: terminated - 0	blocked - 1	blocked - 3	
Before cycle 72: terminated - 0	running - 4	blocked - 2	
Before cycle 73: terminated - 0	terminated - 0	blocked - 1	
Before cycle 74: terminated - 0	terminated - 0	running - 2	
Before cycle 75: terminated - 0	terminated - 0	running - 1	
Before cycle 76: terminated - 0	terminated - 0	blocked - 3	
Before cycle 77: terminated - 0	terminated - 0	blocked - 2	
Before cycle 78: terminated - 0	terminated - 0	blocked - 1	
Before cycle 79: terminated - 0	terminated - 0	running - 3	
Before cycle 80: terminated - 0	terminated - 0	running - 2	
Before cycle 81: terminated - 0	terminated - 0	running - 1	
Before cycle 82: terminated - 0	terminated - 0	blocked - 2	
Before cycle 83: terminated - 0	terminated - 0	blocked - 1	
Before cycle 84: terminated - 0	terminated - 0	running - 4	
Before cycle 85: terminated - 0	terminated - 0	running - 3	
Before cycle 86: terminated - 0	terminated - 0	running - 2	
Before cycle 87: terminated - 0	terminated - 0	running - 1	
Before cycle 88: terminated - 0	terminated - 0	blocked - 4	
Before cycle 89: terminated - 0	terminated - 0	blocked - 3	
Before cycle 90: terminated - 0	terminated - 0	blocked - 2	
Before cycle 91: terminated - 0	terminated - 0	blocked - 1	
Before cycle 92: terminated - 0	terminated - 0	running - 4	
Before cycle 93: terminated - 0	terminated - 0	running - 3	
Before cycle 94: terminated - 0	terminated - 0	running - 2	
Before cycle 95: terminated - 0	terminated - 0	running - 1	
Before cycle 96: terminated - 0	terminated - 0	blocked - 2	
Before cycle 97: terminated - 0	terminated - 0	blocked - 1	
Before cycle 98: terminated - 0	terminated - 0	running - 4	
Before cycle 99: terminated - 0	terminated - 0	running - 3	
Before cycle 100: terminated - 0	terminated - 0	running - 2	
Before cycle 101: terminated - 0	terminated - 0	running - 1	
Before cycle 102: terminated - 0	terminated - 0	blocked - 4	
Before cycle 103: terminated - 0	terminated - 0	blocked - 3	
Before cycle 104: terminated - 0	terminated - 0	blocked - 2	
Before cycle 105: terminated - 0	terminated - 0	blocked - 1	
Before cycle 106: terminated - 0	terminated - 0	running - 4	
Before cycle 107: terminated - 0	terminated - 0	running - 3	
Before cycle 108: terminated - 0	terminated - 0	running - 2	
Process 0:
	(A,B,C,IO) = (0,5,30,3)
	Finishing time: 46
	Turnaround time: 46
	I/O time: 16
	Waiting time: 0
Process 1:
	(A,B,C,IO) = (1,5,30,3)
	Finishing time: 72
	Turnaround time: 71
	I/O time: 15
	Waiting time: 5
Process 2:
	(A,B,C,IO) = (1,5,30,4)
	Finishing time: 108
	Turnaround time: 107
	I/O time: 21
	Waiting time: 12
Summary Data: 
CPU Utilization: 82.56881%
I/O Utilization: 47.70642%
Throughput: 2.7522936
Average tunraround time: 74.666664
Average waiting time: 5.6666665


