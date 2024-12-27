import java.util.Arrays;

public class insertionSort {
    public static int[] Sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                }
                array[j + 1] = key;
                }
                return array;
                }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int[] sortedArr = Sort(arr);
        System.out.println(" Sorted array: "+ Arrays.toString(sortedArr));
    }
    
}
