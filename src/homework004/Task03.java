package homework004;

import java.util.Scanner;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     01.02.2023 13:06
 * Description: the numerical range
 */

public class Task03 {

    public static void main(String[] args) {

        System.out.println("Let's find from which interval the entered number.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 100: ");
        int number = in.nextInt();

        if (number < 0 || number > 100) {
            System.out.println("The number does not match the range 0-100");

        } else if (number >= 0 && number <= 14) {
            System.out.println(number + " are in the 0-14 range");
        } else if (number >= 15 && number <= 35) {
            System.out.println(number + " are in the 15-35 range");
        } else if (number >= 36 && number <= 50) {
            System.out.println(number + " are in the 36-50 range");
        } else if (number >= 51 && number <= 100) {
            System.out.println(number + " are in the 51-100 range");
        }
    }

}
