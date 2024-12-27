package ifelse;

import java.util.Scanner;

public class checkingPositiveorNegative {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        if (num > 0) {
            System.out.println("the number is positive number");
        }
        else if (num < 0) {
            System.out.println("the number is negative");
        }
        else {
            System.out.println("the number is zero");
    }
}
    
}
