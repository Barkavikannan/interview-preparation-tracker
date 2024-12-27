import java.util.Scanner;
public class checkPositive {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num>=0) {
            System.out.println("The number is positive");
            
        }
    }
}
