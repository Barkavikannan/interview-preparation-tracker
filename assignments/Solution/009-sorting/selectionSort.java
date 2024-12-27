import java.util.Arrays;

public class selectionSort {
    public static int[] sort( int[] arr ) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    }
                    }
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                    }
                    return arr;
                    
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,};
        int[] sorted= sort( arr);
        System.out.println("Sorted array is:"+ Arrays.toString(sorted));
    }
    
}
