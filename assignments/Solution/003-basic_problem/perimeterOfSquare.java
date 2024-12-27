import java.util.Scanner;
public class perimeterOfSquare {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int side = input.nextInt();
        int perimeter = 4 * side;
        System.out.println("The perimeter of the square is " + perimeter);
        
    }
    
}
