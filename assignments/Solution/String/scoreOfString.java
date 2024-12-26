import java.util.Scanner;
public class scoreOfString {
    public static int cal(String str) {
                int sum = 0;
                for (int i = 0; i < str.length()-1; i++) {
                    sum += Math.abs(str.charAt(i)-str.charAt(i+1));
        }
        return sum;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string:");
        String str = sc.nextLine();
        int score= cal(str);
        System.out.println(" The sum of absolute difference of adjacent character is: "+ score);
        

    }
    
}
