import java.util.Scanner;
public class areaOfParallelogram {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the base of the parallelogram:");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the parallelogram:");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
        
    }
    
}
