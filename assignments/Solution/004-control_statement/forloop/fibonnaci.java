package forloop;
import java.util.Scanner;
public class fibonnaci {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            }   
    }
    
}
