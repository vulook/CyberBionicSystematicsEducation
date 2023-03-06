package homework009;

import java.util.Arrays;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     24.02.2023 19:29
 * Description:  UserArray
 */

public class Task04 {

    public static void main(String[] args) {

        System.out.println("Array 1: ");
        int[] array1 = createArray();
        printArray(array1);

        System.out.println("Array 2: ");
        int[] array2 = changeArrayLength(array1);
        printArray(array2);

        // integer value in the range [ 0; +999]
        int value = (int) ( Math.random() * 1000 );
        System.out.println("value = " + value);
        System.out.println("Array 3: ");
        int[] array3 = addNewValueToArray(array1, value);
        printArray(array3);

    }

    static int[] createArray() {
        int length = 10;
        int[] arrayInt = new int[length];

        for (int i = 0; i < arrayInt.length; i++) {
            // integer element in the range [ -10; +10](10 inclusive)
            arrayInt[i] = (int) (Math.random() * (20) + 1) - 10; //
        }
        return arrayInt;
    }

    static int[] changeArrayLength(int[] arrayInt) {
        int length = arrayInt.length;
        return Arrays.copyOf(arrayInt, length + 1);
    }

    static int[] addNewValueToArray(int[] array, int value) {
        int length = array.length;
        int[] arrayNew = new int[length + 1];
        arrayNew[0] = value;
        System.arraycopy(array, 0, arrayNew, 1, length);
        return arrayNew;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

}
