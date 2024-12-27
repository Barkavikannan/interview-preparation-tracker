package forloop;
import java.util.Scanner;
public class sumPositiveNum {
    @SuppressWarnings( "resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
