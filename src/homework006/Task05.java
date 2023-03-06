package homework006;

import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     16.02.2023 16:37
 * Description: sum A in between B (A < B)
 */

public class Task05 {

    public static void main(String[] args) {

        int A;
        int B;
        System.out.println("Enter two different integer numbers ... ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        A = s.nextInt();
        System.out.println("Enter second number: ");
        B = s.nextInt();

        if (A < B) {
            System.out.println("The sum of numbers in the intervall: ");
            System.out.println("METHOD1 (getSUM) = " + getSUM(A, B));
            System.out.println("METHOD2 (getArithmeticPogression) = " + getArithmeticPogression(A, B));
        } else {
            System.out.println("Non-compliance with the condition!");
        }

    }

    static int getSUM(int A, int B) {
        int first = A;
        int sum = 0;

        for (int i = first; i <= B; i++) {
            sum += i;
        }
        return sum;
    }

    static int getArithmeticPogression(int A, int B) {
        return (A + B) * (B - A + 1) / 2;
    }

}
