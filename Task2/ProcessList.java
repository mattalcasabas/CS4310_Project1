package Task2;
import java.util.ArrayList;
import java.util.List;

public class ProcessList {
    private List<Process> pl;

    public ProcessList() {
        this.pl = new ArrayList<>();
    }

    public void addProcess(Process p) {
        pl.add(p);
    }

    public List<Process> getProcesses() {
        return pl;
    }

    public int length() {
        return pl.size();
    }

    
}
