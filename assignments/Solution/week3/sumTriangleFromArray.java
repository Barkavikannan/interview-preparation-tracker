import java.util.Arrays;

public class sumTriangleFromArray {
    public static void triangle(int[] n){
        if (n.length<1) {
            return;
            
        }
        int[] a= new int[n.length -1];
        for(int i=0;i<n.length-1;i++){
            a[i]=n[i]+n[i+1];
        }

        triangle(a);

        System.out.println(Arrays.toString(n));

    }
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        triangle(n);

    }
    
}

