package Task1;

public class Merge implements Runnable {
    private int[] arr1;
    private int[] arr2;
    private int[] mergedArray;

    public Merge(int[] a1, int[] a2) {
        this.arr1 = a1;
        this.arr2 = a2;
    }

    public int[] getMergedArray() {
        return this.mergedArray;
    }

    public void run() {
        mergedArray = mergeArrays(arr1, arr2);
    }

    public int[] mergeArrays(int[] a1, int[] a2) {

        // create a new array with the size a1 + a2
        int[] result = new int[a1.length + a2.length];
        // create indices to keep count on a1, a2, and result
        int i = 0;
        int j = 0;
        int k = 0;

        // compare elements from a1 and a2, merge into result
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                result[k++] = a1[i++];
            }
            else {
                result[k++] = a2[j++];
            }
        }

        // copy any remaining elements to the result array
        while (i < a1.length) {
            result[k++] = a1[i++];
        }
        while (j < a2.length) {
            result[k++] = a2[j++];
        }

        return result;

    }


}
