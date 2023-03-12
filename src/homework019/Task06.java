package homework019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     12.03.2023 18:56
 * Description: The Calculator class with static methods that accept two variables
 */

class CalculatorS {

    private CalculatorS() {
    }

    public static double add(double op1, double op2) {
        return op1 + op2;
    }

    public static double difference(double op1, double op2) {
        return op1 - op2;
    }

    public static double multiply(double op1, double op2) {
        return op1 * op2;
    }

    public static double divide(double op1, double op2) throws DivideByZeroException {
        if (op2 == 0) throw new DivideByZeroException();
        return op1 / op2;
    }

    public static double remainder(double op1, double op2) {
        return op1 % op2;
    }

    public static int bitwiseXOR(int op1, int op2) {
        return op1 ^ op2;
    }

    public static int bitwiseOR(int op1, int op2) {
        return op1 | op2;
    }

    public static int bitwiseAND(int op1, int op2) {
        return op1 & op2;
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Cannot divide by zero!");
        System.out.println("Dividing by zero.");
        System.out.println("Program aborted.");
        System.exit(0);
    }
}


public class Task06 {

    public static void main(String[] args) throws DivideByZeroException {

        double fNumber;
        double sNumber;
        double result;
        char operation;
        Scanner s = new Scanner(System.in);

        System.out.println("myCalculator starting ...");
        System.out.println("myCalculator supports operations: + , - , * , / , % , ^ , | , & ");
        System.out.println("Enter first number:");
        fNumber = checkValidNum(s);

        System.out.println("Enter an operation:");
        operation = checkValidOperation(s);

        System.out.println("Enter second number:");
        sNumber = checkValidNum(s);

        switch (operation) {
            case '+':
                result = CalculatorS.add(fNumber, sNumber);
                break;
            case '-':
                result = CalculatorS.difference(fNumber, sNumber);
                break;
            case '*':
                result = CalculatorS.multiply(fNumber, sNumber);
                break;
            case '/':
                result = CalculatorS.divide(fNumber, sNumber);
                break;
            case '%':
                result = CalculatorS.remainder(fNumber, sNumber);
                break;
            case '^':
                result = CalculatorS.bitwiseXOR((int) fNumber, (int) sNumber);
                break;
            case '|':
                result = CalculatorS.bitwiseOR((int) fNumber, (int) sNumber);
                break;
            case '&':
                result = CalculatorS.bitwiseAND((int) fNumber, (int) sNumber);
                break;
            default:
                result = 0;
        }

        System.out.print("\nCalculating: ");
        System.out.println(checkInt(fNumber) + " " + operation + " " + checkInt(sNumber) + " = " + checkInt(result));

    }

    private static double checkValidNum(Scanner s) {
        double vNumber;
        String number = s.nextLine().replace(',', '.');

        while (true) {
            try {
                if (number.isEmpty()) {
                    System.out.println("Operand does not exist!");
                }
                vNumber = Double.parseDouble(number);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input, please enter a valid number. Try again!");
                System.out.print("==> ");
                number = s.nextLine();
            }
        }
        return vNumber;
    }

    private static char checkValidOperation(Scanner s) {
        char vChar;
        String inputString = s.nextLine();

        while (true) {
            try {
                if (inputString.length() != 1) {
                    throw new InputMismatchException("Please enter a single operator. Try again!");
                } else {
                    vChar = inputString.charAt(0);

                    if (vChar == '+' || vChar == '-' || vChar == '*' || vChar == '/'
                            || vChar == '%' || vChar == '^' || vChar == '|' || vChar == '&') {
                        break;
                    } else {
                        throw new InputMismatchException("Please enter a valid operator (+ , - , * , / , % , ^ , | , &). Try again!");
                    }
                }
            } catch (InputMismatchException ime) {
                System.out.println(ime.getMessage());
                System.out.print("==> ");
                inputString = s.nextLine();
            }
        }
        return vChar;
    }

    private static String checkInt(double numb) {
        return (numb % 1) == 0 ? String.valueOf((int) numb) : String.valueOf(numb);
    }

}

