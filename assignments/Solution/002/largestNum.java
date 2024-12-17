import java.util.Scanner;

public class largestNum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num1:");
        long num1 = sc.nextLong();
        System.out.println("enter the num2:");
        long num2 = sc.nextLong();
        if (num1>num2) {
            System.out.println(num1 +"is the largest");
            
        }
        else if (num2>num1) {
            System.out.println(num2 +"is the largest");
        }
        else {
            System.out.println("both are equal");
        }
        }
    }

