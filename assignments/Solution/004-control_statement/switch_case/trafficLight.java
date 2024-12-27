package switch_case;
import java.util.Scanner;
public class trafficLight {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the action( R,Y,G): ");
        String action = sc.next();
        switch (action) {
            case "R":
            System.out.println("Stop");
            break;
            case "Y":
            System.out.println("Wait");
            break;
            case "G":
            System.out.println("Go");
            break;
        }
    }
}
