import java.util.Scanner;
public class checkingVowels {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        char ch= input.next().charAt(0);
        if (ch == 'a' ||ch=='A'|| ch=='e'|| ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
            System.out.println("The character is a vowel");
            
        }
        
    }
    
}
