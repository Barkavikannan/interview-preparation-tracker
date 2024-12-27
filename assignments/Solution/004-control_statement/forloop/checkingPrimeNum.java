package forloop;
import java.util.Scanner;
public class checkingPrimeNum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {
                count++;
                }
            }
        if (count == 0){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
    }
    
}
