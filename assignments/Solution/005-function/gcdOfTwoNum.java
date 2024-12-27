import java.util.Scanner;
public class gcdOfTwoNum {
    public static void gcd(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
            }
            System.out.println("GCD of two numbers is"+ a);
            
        }
    

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        gcd(a, b);

    }
    
}
