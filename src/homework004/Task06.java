package homework004;

import java.util.Scanner;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     04.02.2023 18:27
 * Description: min mid max
 */

public class Task06 {

    public static void main(String[] args) {

        int num1, num2, num3;
        int min = 0, mid = 0, max = 0;
        int min_control, max_control;

        System.out.println("Enter three different integers: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        num1 = in.nextInt();
        System.out.print("Input the second number: ");
        num2 = in.nextInt();
        System.out.print("Input the third number: ");
        num3 = in.nextInt();

        if (num1 >= num2 && num2 >= num3) {
            max = num1;
            mid = num2;
            min = num3;
        } else if (num1 >= num3 && num3 >= num2) {
            min = num2;
            mid = num3;
            max = num1;
        } else if (num2 >= num1 && num1 >= num3) {
            min = num3;
            mid = num1;
            max = num2;
        } else if (num2 >= num3 && num3 >= num1) {
            min = num1;
            mid = num3;
            max = num2;
        } else if (num3 >= num1 && num1 >= num2) {
            min = num2;
            mid = num1;
            max = num3;
        } else if (num3 >= num2 && num2 >= num1) {
            min = num1;
            mid = num2;
            max = num3;
        }

        min_control = Math.min(Math.min(num1, num2), num3);
        max_control = Math.max(Math.max(num1, num2), num3);

        System.out.println("OUTPUT: ");
        System.out.println("==>min: " + min + " (check: " +  min_control + ")");
        System.out.println("==>mid: " + mid);
        System.out.println("==>max: " + max + " (check: " +  max_control + ")");
    }

}
