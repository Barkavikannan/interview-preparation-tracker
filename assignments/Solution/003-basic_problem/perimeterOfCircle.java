import java.util.Scanner;
public class perimeterOfCircle {
    @SuppressWarnings({  "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        double p = 2 * pi* r;
        System.out.println("The perimeter of the circle is: "+p);

        
    }
    
}
