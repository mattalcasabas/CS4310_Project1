package Task2;

import java.util.Arrays;

public class FCFS {
    private double avgWaitTime;
    private double avgResponseTime;
    private double avgTurnaroundTime;
    private double utilRate;
    private ProcessList pl;

    public FCFS(ProcessList pl) {
        this.pl = pl;
    }

    public double getAvgWaitTime() {
        return avgWaitTime;
    }

    public double getAvgResponseTime() {
        return avgResponseTime;
    } 

    public double getAvgTurnaroundTime() {
        return avgTurnaroundTime;
    }

    public double getUtilRate() {
        return utilRate;
    }

    public void schedule() {
        
        // create a clock to keep track of simulated milliseconds
        int clock = 0;
        int totalBurst = 0;

        // convert the process list into a 2d array
        int[][] pVal = pl.to2DArray();

        // create a new array to keep track of arrival times
        int[] arrivalTimes = new int[pVal.length];

        // find the total amount of cpu time needed (totalBurst)
        // also, put all arrival times into the new array
        for (int i = 0; i < pVal.length; i++) {
            totalBurst += pVal[i][2];
            arrivalTimes[i] = pVal[i][1];
        }

        System.out.println("Total CPU time needed: " + totalBurst);

        // Keep track of processes that are yet to finish
        boolean[] isProcessFinished = new boolean[pVal.length];
        Arrays.fill(isProcessFinished, false);

        while (clock <= totalBurst) {
            for (int i = 0; i < pVal.length; i++) {
                int currentProc = 0;
                // check if any process arrives
                for (int j = i; j < pVal.length; j++) {
                    if (clock == pVal[j][1]) {
                        // get the PID of the currently running process
                        currentProc = Math.min(pVal[j][0], 0);
                        // announce process arrival
                        System.out.println("At time " + clock + ", process " + currentProc + " arrives.");
                    }
                }
                // check if we finished our process, if yes, move to next process
                while (clock != pVal[i][2]) {
                    // run this process, increment clock
                    clock++;
                    // announce current clock cycle
                    System.out.println("Current time: " + clock);
                }
                // announce process end
                System.out.println("At time " + clock + ", process " + currentProc + " finishes.");
            }
        }

        

    }
}
