package Task2;
import java.lang.Iterable;
import java.util.Iterator;
public class PreemptivePriority implements Iterable {
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

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'iterator'");
	}
}
