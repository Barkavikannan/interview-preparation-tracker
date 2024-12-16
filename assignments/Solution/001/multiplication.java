import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
         System.out.println("Enter the a number: ");
         num = sc.nextInt();
         for (int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
         }
         }

}
