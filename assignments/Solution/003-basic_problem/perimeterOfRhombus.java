import java.util.Scanner;
public class perimeterOfRhombus {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rhombus: ");
        double length = input.nextDouble();
        double perimeter = 4 * length;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
        
    }
    
}
