import java.util.Scanner;
public class fibonnaci {
    public static void fib(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            }
            }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to see: ");
        int n = input.nextInt();
        fib(n);
    }
    
}
