package homework007;

import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     19.02.2023 20:18
 * Description:  PowerA3(A, B)
 */

public class Task05 {

    public static void main(String[] args) {

        int base;
        int exponent = 3;
        int[] array = {2, 3, 5, 6, 9};

        System.out.println("Java Program to Find the Power of 3.");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = s.nextInt();

        System.out.println(base + " to the power " + exponent + " is: " + power(base, exponent));
        checkDivisibilityRules(array, exponent);

    }

    static int power(int base, int exponent) {
        int power = 1;
        for (int i = 1; i <= exponent; i++)
            power *= base;
        return power;
    }

    static void checkDivisibilityRules(int[] array, int exponent) {
        System.out.println("--------------------------------------");

        for (int j : array) {
            System.out.println(j + " to the power " + exponent + " is: " + power(j, exponent));
        }
    }

}
