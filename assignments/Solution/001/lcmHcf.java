import java.util.Scanner;
public class lcmHcf {
    public static int calHCF(int a, int b) {
        while (b!=0) {
            int temp;
            temp = b;
            b = a % b;
            a = temp;
         }
         
        return a;
     }
    public static int calLCM(int a, int b, int hcf) {
       
         return (a*b)/hcf;
        
    } 

    
    public static void main(String[] args) {
        int  num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();

       
    int hcf = calHCF(num1,num2);
    int lcm = calLCM(num1,num2, hcf);

    System.out.println(" the HCF is :"+hcf);
    System.out.println(" the LCM is :"+lcm);
}
}