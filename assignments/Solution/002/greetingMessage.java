import java.util.Scanner;

public class greetingMessage {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");

        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
     }
    
}
