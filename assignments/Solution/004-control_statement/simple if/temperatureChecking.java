import java.util.Scanner;
public class temperatureChecking {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degree: ");
        int temperature = input.nextInt();
        if (temperature > 30) {
            System.out.println("It's hot outside.");
        }
    }
}
