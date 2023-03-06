package homework006;

import java.util.Scanner;

/**
 * FileName: Task07
 * Author:   Andriy Vulook
 * Date:     18.02.2023 12:55
 * Description: multiplication for the number 7 using loops
 */

public class Task07 {

    public static void main(String[] args) {

        int num = 7;
        int quantity;

        System.out.println("Multiplication with the number 7 ...");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        quantity = s.nextInt();

        calculationSum(num, quantity);

    }

    static void calculationSum(int num, int quantity) {
        int sum = 0;

        for (int i = 1; i <= quantity; i++) {
            sum = num * i;
            System.out.print((String.format("%3d.  ", i)) + num + " * " + i + " = " + sum + " \n");
        }
    }

}
