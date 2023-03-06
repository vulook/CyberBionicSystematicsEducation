package homework007;

import java.util.Scanner;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     15.02.2023 12:04
 * Description: SumMin
 */

public class Task02 {

    public static void main(String[] args) {

        double operand1, operand2;
        char sign;

        System.out.println("The calculator is running ...");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number value: ");
        operand1 = s.nextDouble();
        System.out.print("Enter any operator (+, -, *, /, %): ");
        sign = s.next().charAt(0);
        System.out.print("Enter second number value: ");
        operand2 = s.nextDouble();

        System.out.print(operand1 + " " + sign + " " + operand2 + " = ");
        System.out.print(calculator(sign, operand1, operand2));

    }

    static double calculator (char sign, double operand1, double operand2) {
        double result = 0;

        switch (sign) {
            case '+':
                result = add(operand1, operand2);
                break;
            case '-':
                result = sub(operand1, operand2);
                break;
            case '*':
                result = mul(operand1, operand2);
                break;
            case '/':
                result = div(operand1, operand2);
                break;
            case '%':
                result = mod(operand1, operand2);
                break;
            default:
                System.out.println("You have entered wrong operator or value");
        }
        return result;
    }

    static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    static double sub(double operand1, double operand2) {
        return operand1 - operand2;
    }

    static double mul(double operand1, double operand2) {
        return operand1 * operand2;
    }

    static double div(double operand1, double operand2) {
        if (operand2 == 0) {
            System.out.println("Arithmetic Exception occured! Division by zero.");
            return 0;
        } else {
            return operand1 / operand2;
        }
    }

    static double mod(double operand1, double operand2) {
        return operand1 % operand2;
    }

}
