import java.util.Scanner;

public class armstrongNum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, count);
            num = num / 10;
            count++;
            }
            if (n == sum) {
                System.out.println(n + " is an Armstrong number");
                } else {
                    System.out.println(n + " is not an Armstrong number");
                    }
                    }
    
}