package homework007;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     20.02.2023 03:42
 * Description: PowerA234(A, B, C, D)
 */

public class Task06 {

    public static void main(String[] args) {

        int base;
        int exp2 = 2;
        int exp3 = 3;
        int exp4 = 4;
        int[] array = {2, 3, 5, 6, 9};

        System.out.println("Java Program to Find the Power of 2, 3, 4 ...");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = s.nextInt();

        power(base, exp2, exp3, exp4);
        checkDivisibilityRules(array, exp2, exp3, exp4);

    }

    static void power(int base, int exp2, int exp3, int exp4) {
        BigInteger bi;
        bi = new BigInteger(String.valueOf(base));
        BigInteger result2 = bi.pow(exp2);
        BigInteger result3 = bi.pow(exp3);
        BigInteger result4 = bi.pow(exp4);

        System.out.println(base + " to the power " + exp2 + " is: " + result2);
        System.out.println(base + " to the power " + exp3 + " is: " + result3);
        System.out.println(base + " to the power " + exp4 + " is: " + result4);
    }

    static void checkDivisibilityRules(int[] array, int exp2, int exp3, int exp4) {
        System.out.println("--------------------------------------");

        for (int j : array) {
            System.out.println(j + " to the power " + exp2 + " is: " + (int) Math.pow(j, exp2));
            System.out.println(j + " to the power " + exp3 + " is: " + (int) Math.pow(j, exp3));
            System.out.println(j + " to the power " + exp4 + " is: " + (int) Math.pow(j, exp4));
        }
    }

}
