import java.util.Scanner;
public class perimeterOfEquilateralTraiangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle:");
        int side = sc.nextInt();
        int perimeter = 3 * side;
        System.out.println("The perimeter of the equilateral triangle is: "+perimeter);
        
    }
    
}
