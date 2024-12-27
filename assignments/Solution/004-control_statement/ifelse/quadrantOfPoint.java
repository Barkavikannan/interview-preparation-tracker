package ifelse;
import java.util.Scanner;
public class quadrantOfPoint {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the point: ");
        int x = sc.nextInt();
        System.out.println("Enter the y-coordinate of the point: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("The point x and y is in the first quadrant.");
        }
        else if (x < 0 && y > 0) {
            System.out.println("The point x and y is in the second quadrant.");
        }
        else if (x < 0 && y < 0) {
            System.out.println("The point x and y is in the third quadrant.");
        }
        else if (x > 0 && y < 0) {
            System.out.println("The point x and y is in the fourth quadrant.");
        }

    }

    
}
