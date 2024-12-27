import java.util.Scanner;
public class volumeOfCone {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cone:");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cone:");
        double height = input.nextDouble();
        double volume = (1.0/3.0) * Math.PI * Math.pow(radius,2)* height;
        System.out.println(" The volume of the cone is: "+volume);
        
    }
}
