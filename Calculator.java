import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double n1 = scn.nextDouble();
        double n2 = scn.nextDouble();
        System.out.println("Enter the operation");
        char operation = scn.next().charAt(0);
        double solution = 0;
        boolean error = false;
        switch (operation) {
            case '+': {
                solution = n1 + n2;
            }
                break;
            case '*': {
                solution = n1 * n2;
            }
                break;
            case '/': {
                solution = n1 / n2;
            }
                break;
            case '-': {
                solution = n1 - n2;
            }
                break;
            default: {
                error = true;
                System.out.println("Error: Invalid operation");
            }
        }

        if (error == false) {
            System.out.println(n1 + " " + operation + " " + n2 + " = " + solution);
        }
    }
}