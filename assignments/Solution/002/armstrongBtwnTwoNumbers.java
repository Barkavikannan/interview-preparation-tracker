import java.util.Scanner;

public class armstrongBtwnTwoNumbers {

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int count = 0;
        while (temp != 0) {
            count++;
            temp= temp / 10;
        }
        temp = num;
               
        while (temp!=0) {
            int r = temp % 10;
            sum = sum + (int) Math.pow(r, count);
            temp = temp/10;
        }
        return sum == num;
        }
            
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }


       
        }
    }

