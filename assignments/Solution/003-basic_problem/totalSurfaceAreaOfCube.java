import java.util.Scanner;
public class totalSurfaceAreaOfCube {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube:");
        int side = sc.nextInt();
        double TSA = 6 * Math.pow(side, 2);
        System.out.println("The total surface area of the cube is: " + TSA);

    }
}
