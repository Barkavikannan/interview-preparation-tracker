import java.util.Scanner;

public class fibonnaci {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int firstnum=0, secondnum=1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstnum + " ");
            int sum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = sum;
            }
            }
        }
            