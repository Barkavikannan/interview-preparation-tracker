import java.util.Arrays;

public class cyclicSort {
    public static void sort(int a[]){
        int n = a.length;
        int i=0;
        while(i<n){
            if( a[i]!= i+1){
                int correctIndex = a[i] - 1;
                int temp= a[i];
                a[i]= a[correctIndex];
                a[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        return ;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        sort(arr);
        System.out.println( Arrays.toString(arr) );
    }
    
}
