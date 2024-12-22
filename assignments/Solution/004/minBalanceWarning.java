import java.util.Scanner;
public class minBalanceWarning {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum balance: ");
        int minBalance = scanner.nextInt();
        if (minBalance <=100) {
            System.out.println("Warning: Low balance.");
            
        }
    }
    
}
