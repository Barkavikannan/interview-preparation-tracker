package switch_case;
import java.util.Scanner;
public class noOfDaysInMonth {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Number of days in the month is 31");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Number of days in the month is 30");
            break;
            case 2:
            System.out.println("Number of days in the month is 28");
            break;
        }
    }
    
}
