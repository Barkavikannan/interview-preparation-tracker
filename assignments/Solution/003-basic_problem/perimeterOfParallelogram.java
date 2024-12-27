import java.util.Scanner;
public class perimeterOfParallelogram {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the parallelogram: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the parallelogram: ");
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
        
    }
    
}
