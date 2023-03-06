package homework006;

import java.util.Scanner;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     15.02.2023 12:05
 * Description: Sum in interval or show OOD numbers
 */

public class Task02 {

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
            System.out.println("The sum of numbers in the interval: ");
            System.out.println("METHOD1 (get SUM) = " + getSUM(A, B));
            System.out.println("METHOD2 (get ArithmeticPogression) = " + getArithmeticPogression(A, B));
        } else if (A > B) {
            System.out.println("ODD numbers in the interval: ");
            getODD(A, B);
        } else if (A == B) {
            System.out.println("The SAME numbers are entered (==)! ");
        } else {
            System.out.println("ERROR!");
        }

    }

    static int getSUM(int A, int B) {
        int first = A + 1;
        int sum = 0;

        for (int i = first; i < B; i++) {
            sum += i;
        }
        return sum;
    }

    static int getArithmeticPogression(int A, int B) {
        int a = A + 1;
        int b = B - 1;
        return (a + b) * (b - a + 1) / 2;
    }

    static void getODD(int A, int B) {
        int first = B + 1;
        int count = 0;

        for (int i = first; i < A; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0)
            System.out.println("There are no ODD numbers! ");
    }

}
