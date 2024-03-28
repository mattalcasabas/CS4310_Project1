package Task2;


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
        while (true) {

        }

    }
}
