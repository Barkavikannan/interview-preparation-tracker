package dowhile;
import java.util.Scanner;
public class numberGuessingGame {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int count = 0;
       do {
        System.out.println("Guess a number between 1 and 100");
        guess = sc.nextInt();
        count++;
        if (guess < number) {
            System.out.println("Your guess is too low");
            } else if (guess > number) {
                System.out.println("Your guess is too high");
                }
        
       } while ( guess != number);
       System.out.println("You guessed the number in " + count + " attempts");
    }
    
}
