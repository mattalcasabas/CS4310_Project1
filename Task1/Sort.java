package Task1;

import java.util.Arrays;
public class Sort implements Runnable {
    private int[] sortArray;

    // constructor method
    public Sort(int[] arr) {
        this.sortArray = arr;
    }

    // sort the array
    public void run() {
        System.out.println("New thread started, sorting array...");
        Arrays.sort(sortArray);
    }
    
    public int[] getSortedArray() {
        return this.sortArray;
    }

}
