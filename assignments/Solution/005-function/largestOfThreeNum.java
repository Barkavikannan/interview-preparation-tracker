import java.util.Scanner;
public class largestOfThreeNum {
    public static int largest(int a, int b, int c) {
        if (a>b && a>c) {
            return a;    
        }
        else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }


    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Enter the third number: ");
        int c = input.nextInt();
        
        System.out.println("The largest number is: " + largest(a, b, c));

    }

    
}