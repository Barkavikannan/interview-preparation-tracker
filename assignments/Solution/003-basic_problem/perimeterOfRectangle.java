import java.util.Scanner;
public class perimeterOfRectangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = input.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        
    }
    
}
