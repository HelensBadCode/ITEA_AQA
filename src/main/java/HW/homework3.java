package HW;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        System.out.println("For use the calculator, enter two numbers and one of the available operations.");
        System.out.println("Actions that the calculator can perform: \n" +
                "addition                - '+'\n" +
                "subtraction             - '-'\n" +
                "division                - '/'\n" +
                "multiplication          - '*'\n" +
                "degree                  - '^'\n" +
                "division with remainder - '%'");

        double num1;
        double num2;
        char opt = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: \n");
        num1 =reader.nextDouble();
        System.out.print("Enter an operator ( +, -, *, /,^, % ): \n");
        opt = reader.next().charAt(0);
        System.out.print("Enter second number: \n");
        num2 =reader.nextDouble();
        double result;
        switch(opt)

        {
            case '+':
                result = num1 + num2;
                System.out.println("Result is : " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result is : " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result is : " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result is : " + result);
                break;
            case '^':
                result = Math.pow(num1, num2);
                System.out.println("Result is : " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Result is : " + result);
                break;
            default:
                System.out.println("The operation is not recognized. Re-enter.");

        }
    }
}
