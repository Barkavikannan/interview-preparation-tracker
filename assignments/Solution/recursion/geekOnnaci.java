import java.util.Scanner;
public class geekOnnaci {
    public static int find(int a, int b, int c, int n) {
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;

        int result = find(a, b, c, n - 1) 
             + find(a, b, c, n - 2) 
             + find(a, b, c, n - 3);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(" output is"+ find(a, b, c, n));
            t--;
        }

        sc.close();
    }
    
}
