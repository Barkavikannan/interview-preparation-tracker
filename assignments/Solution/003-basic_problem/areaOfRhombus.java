
import java.util.Scanner;
public class areaOfRhombus {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rhombus: ");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rhombus: ");
        int width = sc.nextInt();
        double area = (length * width)/2;
        System.out.println("The area of the rhombus is: " + area);
    }
    
}
