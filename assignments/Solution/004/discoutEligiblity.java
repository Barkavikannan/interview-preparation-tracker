import java.util.Scanner;
public class discoutEligiblity {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of the purchase:");
        double amount = sc.nextDouble();
        if(amount>=500){
            System.out.println("You are eligible for a discount");
        }
    }
}
