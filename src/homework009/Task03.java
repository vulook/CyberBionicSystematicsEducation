package homework009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     24.02.2023 13:26
 * Description: ReversedArray
 */

public class Task03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        int[] arrayInt = createArray(br, random);
        System.out.println("Array of integers: ");
        printArray(arrayInt);

        System.out.println("Reverse an Array of integers: ");
        printArray(myReverse(arrayInt));

        int length = arrayInt.length;
        int index = length - random.nextInt((length) + 1);
        System.out.println("index = " + index);
        int count = length + random.nextInt((length) + 1);
        System.out.println("count = " + count);
        System.out.println("Sub Array of integers: ");
        printArray(subArray(arrayInt, index, count));

    }

    static int[] createArray(BufferedReader br, Random random) throws IOException {
        System.out.print("Enter length of array [for example 10]: ");
        int length = Integer.parseInt(br.readLine());
        int[] arrayInt = new int[length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(length * 10);
        }
        return arrayInt;
    }

    static int[] myReverse(int[] arrayInt) {
        int length = arrayInt.length;
        int[] arrayReverse = new int[length];

        for (int j = 0; j < arrayInt.length; j++) {
            arrayReverse[j] = arrayInt[length - j - 1];
        }
        return arrayReverse;
    }

    static int[] subArray(int[] arrayInt, int index, int count) {
        int[] arrayNew = new int[count];

        for (int i = 0; i < arrayNew.length; i++) {
            if (index + i < arrayInt.length) {
                arrayNew[i] = arrayInt[index + i];
            } else {
                arrayNew[i] = 1;
            }
        }
        return arrayNew;
    }

    static void printArray(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("\n");
    }

}
