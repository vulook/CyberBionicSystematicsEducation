package homework009;

import java.io.IOException;
import java.util.Random;

/**
 * FileName: Task07
 * Author:   Andriy Vulook
 * Date:     24.02.2023 19:31
 * Description: Array to Reverse
 *
 * Random number between -1000 and +1000
 * randomGenerator.nextInt((maximum – minimum) + 1) + minimum
 * randomGenerator.nextInt((+1000 – -1000) + 1) + -1000
 */

public class Task07 {

    public static void main(String[] args) throws IOException {
        int length = 10;
        int[] arrayInt = new int[length];
        Random random = new Random();

        System.out.println("Original Array:");
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt((2000) + 1) - 1000;
            System.out.print(arrayInt[i] + "  ");
        }

        System.out.println("\nReverse Array:");
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(arrayInt[i] + "  ");
        }
    }

}
