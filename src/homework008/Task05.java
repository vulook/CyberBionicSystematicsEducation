package homework008;

import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     21.02.2023 12:31
 * Description: Calculator
 */

public class Task05 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        calculate(checkValidInteger(s));

    }

    static int[] checkValidInteger(Scanner s) {

        int[] arrInt = new int[3];
        System.out.println("Enter three integers: ");

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("Enter " + (i + 1) + "-st/nd/th digit: ");
            String input = s.nextLine();
            int numbInt;

            while (true) {
                try {
                    numbInt = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("This is not an integer. Try again!");
                    System.out.print("==> ");
                }
                input = s.nextLine();
            }
            arrInt[i] = numbInt;
        }
        return arrInt;
    }

    static double[] calculate(int[] arrInt) {

        double divisor = 5.;
        double[] arrDouble = new double[arrInt.length];

        for (int i = 0; i < arrDouble.length; i++) {
            arrDouble[i] = arrInt[i] / divisor;
            System.out.println(arrInt[i] + " division by " + divisor + " = " + arrDouble[i]);
        }
        return arrDouble;
    }

}
