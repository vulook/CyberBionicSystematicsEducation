package homework004;

import java.util.Scanner;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     01.02.2023 11:43
 * Description: Calc
 */

public class Task02 {

    public static void main(String[] args) {

        double operand1, operand2, result;
        char sign;

        System.out.println("The calculator is running ...");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number value:");
        operand1 = s.nextDouble();
        System.out.print("Enter second number value:");
        operand2 = s.nextDouble();
        System.out.print("Enter any operator (+, -, *, /, %): ");
        sign = s.next().charAt(0);

        switch (sign) {
            case '+':
                result = operand1 + operand2;
                break;    // condition for Addition
            case '-':
                result = operand1 - operand2;
                break; // condition for Subtraction
            case '*':
                result = operand1 * operand2;
                break; // condition for Multiplication
            case '/':
            {
                if (operand2 == 0) System.out.println("ArithmeticException occured! Division by zero.");
                result = operand1 / operand2;
            }
                break; // condition for Divison
            case '%':
                result = operand1 % operand2;
                break; // condition for Modulus
            default:
                System.out.println("You have entered wrong operator or value");
                return;
        }

        System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }

}
