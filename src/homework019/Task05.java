package homework019;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
 *
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
class Calculator {

    private double operand1;
    private double operand2;

}

class Calculation {

    public double add(double op1, double op2) {
        return op1 + op2;
    }

    public double difference(double op1, double op2) {
        return op1 - op2;
    }

    public double multiply(double op1, double op2) {
        return op1 * op2;
    }

    public double divide(double op1, double op2) {
        return op1 / op2;
    }

    public double remainder(double op1, double op2) {
        return op1 % op2;
    }

    public int bitwiseXOR(double op1, double op2) {
        return (int) op1 ^ (int) op2;
    }

    public int bitwiseOR(double op1, double op2) {
        return (int) op1 | (int) op2;
    }

    public int bitwiseAND(double op1, double op2) {
        return (int) op1 & (int) op2;
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Cannot divide by zero!");
        System.out.println("Dividing by zero.");
        System.out.println("Program aborted.");
        System.exit(0);
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}


public class Task05 {

    public static void main(String[] args) throws DivideByZeroException {

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
        calculator.setOperand1(firstNumber);
        calculator.setOperand2(secondNumber);

        Calculation calculation = new Calculation();

        switch (operation) {
            case '+':
                result = calculation.add(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '-':
                result = calculation.difference(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '*':
                result = calculation.multiply(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '/':
                if (calculator.getOperand2() == 0) throw new DivideByZeroException();
                result = calculation.divide(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '%':
                result = calculation.remainder(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '^':
                result = calculation.bitwiseXOR(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '|':
                result = calculation.bitwiseOR(calculator.getOperand1(), calculator.getOperand2());
                break;
            case '&':
                result = calculation.bitwiseAND(calculator.getOperand1(), calculator.getOperand2());
                break;
            default:
                result = 0;
        }

        System.out.print("\nCalculating: ");
        System.out.println(checkInt(firstNumber) + " " + operation + " " + checkInt(secondNumber) + " = " + checkInt(result));

    }

    static double checkValidNum(Scanner s) {
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

    static char checkValidOperation(Scanner s) {
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

    static String checkInt(double numb) {
        return (numb % 1) == 0 ? String.valueOf((int) numb) : String.valueOf(numb);
    }

}
