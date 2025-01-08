import java.util.Arrays;

public class cyclicSort {
    public static void sort( int[] arr, int i ) {
        int n= arr.length;
        if(i== n){
            return;
        }
        if( arr[i]!=i+1 ){
            int correctIndex = arr[i]-1;
            int temp = arr[i];
            arr[i]= arr[correctIndex];
            arr[correctIndex] = temp;

            sort( arr, i+1);
        }
        else{
            sort(arr, i+1);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        sort( arr, 0);
        System.out.println( Arrays.toString(arr));
    }
    
}
