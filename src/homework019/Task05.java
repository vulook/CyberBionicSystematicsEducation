package homework019;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     10.03.2023 20:12
 * Description: class Calculator. Input errors throw exceptions.
 * <p>
 * NaN in Java
 * https://www.baeldung.com/java-not-a-number
 */

@Getter
@Setter
@NoArgsConstructor
class Calculator {

    private double op1;
    private double op2;

    public double add() {
        return op1 + op2;
    }

    public double difference() {
        return op1 - op2;
    }

    public double multiply() {
        return op1 * op2;
    }

    public double divide() {
        return op1 / op2;
    }

    public double remainder() {
        return op1 % op2;
    }

    public int bitwiseXOR() {
        return (int) op1 ^ (int) op2;
    }

    public int bitwiseOR() {
        return (int) op1 | (int) op2;
    }

    public int bitwiseAND() {
        return (int) op1 & (int) op2;
    }
}

class DivByZeroException extends Exception {
    public DivByZeroException() {
        super("Cannot divide by zero!");
        System.out.println("Dividing by zero.");
        System.out.println("Program aborted.");
        System.exit(0);
    }

    public DivByZeroException(String message) {
        super(message);
    }
}


public class Task05 {

    public static void main(String[] args) throws DivByZeroException {

        double firstNumber;
        double secondNumber;
        double result;
        char operation;
        Scanner s = new Scanner(System.in);

        System.out.println("myCalculator starting ...");
        System.out.println("myCalculator supports operations: + , - , * , / , % , ^ , | , & ");
        System.out.println("Enter first number:");
        firstNumber = checkValidNum(s);

        System.out.println("Enter an operation:");
        operation = checkValidOperation(s);

        System.out.println("Enter second number:");
        secondNumber = checkValidNum(s);

        Calculator calculator = new Calculator();
        calculator.setOp1(firstNumber);
        calculator.setOp2(secondNumber);


        switch (operation) {
            case '+':
                result = calculator.add();
                break;
            case '-':
                result = calculator.difference();
                break;
            case '*':
                result = calculator.multiply();
                break;
            case '/':
                if (calculator.getOp2() == 0) throw new DivByZeroException();
                result = calculator.divide();
                break;
            case '%':
                result = calculator.remainder();
                break;
            case '^':
                result = calculator.bitwiseXOR();
                break;
            case '|':
                result = calculator.bitwiseOR();
                break;
            case '&':
                result = calculator.bitwiseAND();
                break;
            default:
                result = 0;
        }

        System.out.print("\nCalculating: ");
        System.out.println(checkInt(firstNumber) + " " + operation + " " + checkInt(secondNumber) + " = " + checkInt(result));

    }

    private static double checkValidNum(Scanner s) {
        double validNumber;
        String number = s.nextLine();

        while (true) {
            try {
                if (number.isEmpty()) {
                    System.out.println("Operand does not exist!");
                }
                validNumber = Double.parseDouble(number);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("This is not a number. Try again!");
                System.out.print("==> ");
                number = s.nextLine();
            }
        }
        return validNumber;
    }

    private static char checkValidOperation(Scanner s) {
        char validChar;
        String inputString = s.nextLine();

        while (true) {
            try {
                if (inputString.length() != 1) {
                    throw new InputMismatchException("Please enter a single operator. Try again!");
                } else {
                    validChar = inputString.charAt(0);

                    if (validChar == '+' || validChar == '-' || validChar == '*' || validChar == '/'
                            || validChar == '%' || validChar == '^' || validChar == '|' || validChar == '&') {
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
        return validChar;
    }

    private static String checkInt(double numb) {
        return (numb % 1) == 0 ? String.valueOf((int) numb) : String.valueOf(numb);
    }

}
