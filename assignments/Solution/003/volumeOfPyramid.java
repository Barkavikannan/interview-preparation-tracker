import java.util.Scanner;
public class volumeOfPyramid {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base area of the pyramid:");
        double baseArea = input.nextDouble();
        System.out.println("Enter the height of the pyramid:");
        double height = input.nextDouble();
        double volume = (1.0/3) * baseArea * height;
        System.out.println("The volume of the pyramid is: " + volume);
        

    }
    
}
