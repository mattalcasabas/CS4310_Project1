package Task2;

public class SJF {
    private double avgWaitTime;
    private double avgResponseTime;
    private double avgTurnaroundTime;
    private double utilRate;
    private ProcessList pl;

    public SJF(ProcessList pl) {
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
        
    }
}
