package Task2;
import java.util.ArrayList;
import java.util.List;

public class ProcessList {
    private List<Process> pl;

    public ProcessList() {
        this.pl = new ArrayList<>();
    }

    public void add(Process p) {
        pl.add(p);
    }

    public List<Process> getProcesses() {
        return pl;
    }

    public int length() {
        return pl.size();
    }

    public int[][] to2DArray() {
        // 4 columns for PID, arrival time, burst time, and priority
        int[][] array = new int[pl.size()][4]; 
    
        for (int i = 0; i < pl.size(); i++) {
            Process process = pl.get(i);
            array[i][0] = process.getPID();
            array[i][1] = process.getArrivalTime();
            array[i][2] = process.getBurstTime();
            array[i][3] = process.getPriority();
        }
    
        return array;
    }

    
}
