package Task2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter name of input file: ");
        String fileName = kb.nextLine();
        kb.close();

        // create a list to hold the processes that will be scheduled
        List<Process> processes = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
    
            // read lines from the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // split line into fields based on space char
                String[] fields = line.split(" ");
                // convert each field to an int
                int pid = Integer.parseInt(fields[0]);
                int arrival_time = Integer.parseInt(fields[1]);
                int burst_time = Integer.parseInt(fields[2]);
                int priority = Integer.parseInt(fields[3]);
                // create a new Process object based off each field
                Process proc = new Process(pid, arrival_time, burst_time, priority);
                processes.add(proc);
            }
            fileScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // print out each process so we know what we have (for debug)
        for (Process process : processes) {
            System.out.println(process.getPID() + ", " + process.getArrivalTime() + ", " + process.getBurstTime() + ", " + process.getPriority());
        }
        
    }
}
