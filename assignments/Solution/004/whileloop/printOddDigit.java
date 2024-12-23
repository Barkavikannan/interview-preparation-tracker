package whileloop;
import java.util.Scanner;
public class printOddDigit {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        
        while ( n!=0) {
            int rem=n%10;
            if(rem%2!=0){
                System.out.print(rem+" ");
                }
                n=n/10;
                }
                }

            }
            
