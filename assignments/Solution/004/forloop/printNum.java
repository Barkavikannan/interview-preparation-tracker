package forloop;
import java.util.Scanner;
public class printNum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number : ");
        int n = sc.nextInt();
        System.out.println("Enter the ending number : ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }

    }
    
}
