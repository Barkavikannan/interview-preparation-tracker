import java.util.Scanner;
public class pattern_5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
}
