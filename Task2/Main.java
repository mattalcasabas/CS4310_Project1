package Task2;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter name of input file: ");
        String fileName = kb.nextLine();

        // create a list to hold the processes that will be scheduled
        ProcessList processes = new ProcessList();

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

        // prompt user on which scheduler should run
        System.out.print("Choose a scheduling algorithm:\n");
        System.out.println("1. FCFS");  
        System.out.println("2. SJF"); 
        System.out.println("3. Preemptive priority"); 
        System.out.println("4. Round robin"); 
        int choice = kb.nextInt();
        kb.close();
        
        // select an algorithm based on user's choice
        switch (choice) {
            case 1:
                FCFS schedFcfs = new FCFS(processes);
                schedFcfs.schedule();
                break;
            case 2:
                SJF schedSjf = new SJF(processes);
                schedSjf.schedule();
                break;
            case 3:
                PreemptivePriority schedPreemptivePriority = new PreemptivePriority(processes);
                schedPreemptivePriority.schedule();
                break;
            case 4:
                RoundRobin schedRoundRobin = new RoundRobin(processes);
                schedRoundRobin.schedule();
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.exit(0);

        

    }
}
