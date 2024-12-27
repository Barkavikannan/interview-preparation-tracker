import java.util.Scanner;
public class curvedSurfaceAreaOfCylinder {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double h = sc.nextDouble();
        double TSA = (2* Math.PI* Math.pow(r, 2)) + (2*Math.PI*r*h);
        System.out.println("the surface area of the cylinder is: "+TSA);
        

    }
}
