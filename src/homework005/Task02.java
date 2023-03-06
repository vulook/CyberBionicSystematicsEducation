package homework005;

import java.util.Scanner;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     12.02.2023 23:22
 * Description: bitwise operations on a number to determine whether it is even or odd.
 */

public class Task02 {

    public static void main(String[] args) {

        int number;
        System.out.println("Enter an arbitrary integer:");
        System.out.print("==> ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        if (findParity1(number)) System.out.println("1. Even Parity");
        System.out.println("1. Odd Parity");

        if (findParity2(number)) System.out.println("2. Even Parity");
        System.out.println("2. Odd Parity");

        if (findParity3(number)) System.out.println("3. Even Parity");
        System.out.println("3. Odd Parity");

    }

    // An even number OR 1 will always increment the number by 1.
    // An odd number OR 1 will always result in the same number.
    static boolean findParity1(int number) {
        return (number | 1) > number;
    }

    //An even number AND 1 always results in a 0.
    // On the other hand, an odd number AND 1 results in a 1.
    static boolean findParity2(int number) {
        return (number & 1) == 0;
    }

    // Bitwise XOR is the optimal solution to check the parity of a number.
    // An even number XOR 1 always increases the number by 1, while an odd number XOR 1 always decreases it by 1.
    static boolean findParity3(int number) {
        return (number ^ 1) > number;
    }

}
