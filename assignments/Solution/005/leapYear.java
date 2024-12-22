import java.util.Scanner;
public class leapYear {
    public static int checkLeapYear(int year) {
        if (year % 4 == 0 ||year % 400 == 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        int result = checkLeapYear(year);
        if(result == 1){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

    }
    
}
