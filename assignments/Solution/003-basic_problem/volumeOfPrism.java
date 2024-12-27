import java.util.Scanner;
public class volumeOfPrism {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of the prism: ");
        double length = input.nextDouble();
        System.out.println("Enter the height of the prism: ");
        double height = input.nextDouble();
        System.out.println("Enter the width of the prism: ");
        double width = input.nextDouble();
        
        double volume = (length * height * width)/2;
        System.out.println("The volume of the prism is: " + volume);


    }
    
}
