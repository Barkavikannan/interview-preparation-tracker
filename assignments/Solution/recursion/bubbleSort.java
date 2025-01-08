import java.util.Arrays;

public class bubbleSort {
    public static void sort(int a[], int n) {
        if (n==1)
        return;

        for( int i = 0; i < n-1; i++ ) {
            if ( a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            sort( a, n-1 );
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,6,2};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}
