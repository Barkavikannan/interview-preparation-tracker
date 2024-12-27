package dowhile;
import java.util.Scanner;
public class inputValidation {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter your number: ");
             n = sc.nextInt();
            if (n <=0) {
                System.out.println("Please enter a positive number");
                }

            
        } while (n<=0);
            System.out.println("you entered positive number "+ n);
        
    }
    
}
