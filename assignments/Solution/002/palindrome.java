import java.util.Scanner;

public class palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();     
        for ( int i = length - 1; i >= 0; i-- )    
          rev = rev + str.charAt(i);    
        if (str.equals(rev))    
           System.out.println("it is a palindrome.");    
        else    
           System.out.println("it is not a palindrome.");     
     }    
}
