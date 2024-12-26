import java.util.Scanner;
public class valueOfVar {
    public static int finalValueAfterOperations(String[] operations)  {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X")|| operations[i].equals("X++")) {
                X ++;
            }
            else  {
                X --;
            }
        }
        return X;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a variable: ");
        String[] operations = input.nextLine().split("\\s+");
        System.out.println(" The final value of X is " + finalValueAfterOperations( operations) );
        
        

    }
    
}
