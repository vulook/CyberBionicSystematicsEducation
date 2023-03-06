package homework007;

import java.util.Scanner;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     19.02.2023 18:43
 * Description: NumbersCheck
 */

public class Task04 {

    public static void main(String[] args) {

        int numb;
        int[] array = {2, 3, 5, 6, 9};

        System.out.println("the number is positive or negative.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any value: ");
        numb = s.nextInt();

        check_POS_NEG(numb);
        check_Prime(numb);
        checkDivisibilityRules(numb, array);

    }

    static void check_POS_NEG(int numb) {
        if (numb > 0) {
            System.out.println(numb + " is positive.");
        } else if (numb < 0) {
            System.out.println(numb + " is negative.");
        } else {
            System.out.println(numb + " is zero.");
            System.exit(0);
        }
    }

    static void check_Prime(int numb) {
        int count = 0;

        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) count++;
        }

        if (count == 2) System.out.println(numb + " is prime");
        else System.out.println(numb + " is not prime");
    }

    static void checkDivisibilityRules(int numb, int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (numb % array[i] == 0) {
                System.out.print(numb + " is divisible by " + array[i]);
                System.out.println(". Result: " + numb / array[i]);
            } else {
                System.out.print(numb + " is not divisible by " + array[i]);
                System.out.println(". Result: " + (double) numb / array[i]);
            }
        }
    }

}
