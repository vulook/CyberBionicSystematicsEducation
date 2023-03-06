package homework005;

import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     15.02.2023 0:46
 * Description: PowerOfTwo
 */

public class Task05 {

    public static void main(String[] args) {

        int number;
        System.out.println("Check if integer number is Power of Two ... ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        number = s.nextInt();

        System.out.print("Is " + number + " power of two: ");
        System.out.println(isPowerOfTwo(number) ? "Yes" : "No");

    }

    static boolean isPowerOfTwo(int number) {
        return (number != 0) && ((number & (number - 1)) == 0);
    }

}