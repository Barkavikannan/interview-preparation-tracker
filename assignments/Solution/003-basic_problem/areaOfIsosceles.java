import java.util.Scanner;

public class areaOfIsosceles {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the base of the isosceles triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the length of the equal sides of the isosceles triangle:");
        int a = sc.nextInt();
        double height =  Math.sqrt(Math.pow(a,2)-(Math.pow(b/4,2)));
        double area = (b*height)/2;
        System.out.println("The area of the isosceles triangle is: "+area);
        }

    
}
