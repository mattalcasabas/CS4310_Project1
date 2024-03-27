package Task2;

public class Process {
    private int PID;
    private int arrival_time;
    private int burst_time;
    private int priority;

    public Process(int PID, int arrival_time, int burst_time, int priority) {
        this.PID = PID;
        this.arrival_time = arrival_time;
        this.burst_time = burst_time;
        this.priority = priority;
    }

    public int getPID() {
        return this.PID;
    }

    public int getArrivalTime() {
        return this.arrival_time;
    }

    public int getBurstTime() {
        return this.burst_time;
    }

    public int getPriority() {
        return this.priority;
    }
}
