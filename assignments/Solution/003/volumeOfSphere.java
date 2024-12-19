import java.util.Scanner;
public class volumeOfSphere {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("The volume of the sphere is: " + volume);
        
    }
}
