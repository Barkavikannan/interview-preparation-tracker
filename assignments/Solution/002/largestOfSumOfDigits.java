import java.util.Scanner;

public class largestOfSumOfDigits{
    
    public static int sumOfDigit(long a) {
        int sum = 0;
        while (a != 0) {
            sum += (int) (a % 10);
            a /= 10;
            }
            return sum;
    }



    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num1:");
        long num1 = sc.nextLong();
        System.out.println("enter the num2:");
        long num2 = sc.nextLong();
        
        int a=sumOfDigit(num1);
        int b=sumOfDigit(num2);

        if (a>b) {
            System.out.println(a+"num1 is the largest");
            
        }
        else if (b>a) {
            System.out.println(b+"num2 is the largest");
        }
        else {
            System.out.println("both are equal");
        }
        }
    }
