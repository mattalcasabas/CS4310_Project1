package Task2;

public class PreemptivePriority {
    private double avgWaitTime;
    private double avgResponseTime;
    private double avgTurnaroundTime;
    private double utilRate;
    private ProcessList pl;

    public PreemptivePriority(ProcessList pl) {
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
