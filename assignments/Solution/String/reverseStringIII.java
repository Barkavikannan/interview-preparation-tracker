//package interview-preparation-tracker.assignments.Solution.String;
import java.util.Scanner;
public class reverseStringIII {
    public static String rev( String s){
        String[] word=s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String words: word){
            result.append(new StringBuilder(words).reverse()).append(" ");
            }

            return result.toString().trim();
       }
        
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String s = sc.nextLine();
        System.out.println(rev(s));
        
    }

    
}
