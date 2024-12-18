import java.util.Scanner;

public class areaOfIsosceles {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the base of the isosceles triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the length of the equal sides of the isosceles triangle:");
        int equalSide = sc.nextInt();
        double area = (1.0/2)*b* Math.sqrt(equalSide*equalSide-equalSide);
        System.out.println("The area of the isosceles triangle is: "+area);
        }
        
    
}
