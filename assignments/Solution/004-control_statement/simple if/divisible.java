import java.util.Scanner;
public class divisible {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n%5==0) {
            System.out.println("the number is divisible by 5");
        }
    }
    
}
