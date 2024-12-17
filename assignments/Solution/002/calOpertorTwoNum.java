import java.util.Scanner;

public class calOpertorTwoNum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
            System.out.println("Addition: " + (num1 + num2));
            break;
            case '-':
            System.out.println("Subtraction: " + (num1 - num2));
            break;
            case '*':
            System.out.println("Multiplication: " + (num1 * num2));
            break;
            case '/':
            if (num2 != 0) {
                System.out.println("Division: " + (num1 / num2));
                }
                else {
                    System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
            default:
                System.out.println("Error! Invalid operator.");
         }
  }

    }
    
