import java.util.Scanner;
public class areaOfCircle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
    
}
