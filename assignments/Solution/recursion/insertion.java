import java.util.Arrays;

public class insertion {
    public static void sort( int[] arr, int n) {
        if(n<=1)
        return;

        sort(arr, n-1);
        int last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

    }
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}
