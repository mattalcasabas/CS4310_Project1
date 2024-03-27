package Task1;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // create the array to be sorted and print it
        int[] array = new int[] { 7, 12, 19, 3, 18, 4, 2, 6, 15, 8 };
        System.out.println("Array: " + Arrays.toString(array));

        // split the array in half
        int[] a1 = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] a2 = Arrays.copyOfRange(array, array.length / 2, array.length);

        // create 2 threads to sort each half of the array
        Sort s1 = new Sort(a1);
        Sort s2 = new Sort(a2);
        Thread thread1 = new Thread(s1);
        Thread thread2 = new Thread(s2);
        
        thread1.start();
        thread2.start();
        
        try {
            // wait for both threads to finish sorting
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print the sorted arrays 
        int[] as1 = s1.getSortedArray();
        int[] as2 = s2.getSortedArray();
        // System.out.println("\nSorted array 1: " + Arrays.toString(as1));
        // System.out.println("Sorted array 2: " + Arrays.toString(as2));

        // create thread to merge the arrays
        Merge m = new Merge(as1, as2);
        Thread thread3 = new Thread(m);
        thread3.start();

        try {
            // wait for thread3 to finish up
            thread3.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        // retrieve the sorted, merged array
        int[] finalArray = m.getMergedArray(); 

        // print the final sorted, merged array
        System.out.println("Final array: " + Arrays.toString(finalArray));

    }
}
