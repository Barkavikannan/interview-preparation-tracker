//package interview-preparation-tracker.assignments.Solution.009-sorting;

public class bubbleSort {
    public static int[] Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        int[] sortArray = Sort(array);
        System.out.println(" Sorted array:" + java.util.Arrays.toString(sortArray));
    }    
}
