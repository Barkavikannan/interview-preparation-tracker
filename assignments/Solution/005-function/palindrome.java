import java.util.Scanner;
public class palindrome {
    @SuppressWarnings("resource")
    public static void checkPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num=n;
        int rev=0;
        while (n>0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (num == rev) {
            System.out.println(num + " is a palindrome number");
        }   
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        checkPalindrome();

    }
    
}
