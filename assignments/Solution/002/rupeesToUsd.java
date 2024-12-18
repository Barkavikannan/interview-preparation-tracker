import java.util.Scanner;
public class rupeesToUsd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees");
        int rupees = sc.nextInt();
        double usd = rupees * 0.012;
        System.out.println("The amount in USD is " + usd);

    }
    
}
