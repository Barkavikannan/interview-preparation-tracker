import java.util.Arrays;

public class selection {
    public static void sort( int a[], int n, int index ) {
        if (index == n - 1) {
            return;
        }
        int minIndex = index;
        for (int i = index + 1; i < n; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        int temp = a[index];
        a[index] = a[minIndex];
        a[minIndex] = temp;
        
        sort(a, n, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {64,34,12,72,25,22};
        int index = 0;
        sort(arr, arr.length, index);
        System.out.println(Arrays.toString(arr));
    }
    
}
