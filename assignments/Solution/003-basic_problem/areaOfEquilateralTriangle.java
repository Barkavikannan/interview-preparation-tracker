import java.util.Scanner;
public class areaOfEquilateralTriangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle");
        int a = sc.nextInt();
        double area = (Math.sqrt(3)/4)*(a*a);
        System.out.println("The area of the equilateral triangle is "+area);
    }
    
}
