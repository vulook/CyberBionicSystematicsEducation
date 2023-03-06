package homework009;

import java.util.Random;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     25.02.2023 11:06
 * Description: add two arrays3x3
 */

public class Task06 {

    public static void main(String[] args) {

        int s = (int) (Math.random() * 10) + 5; //size array1
        int y = (int) (Math.random() * 5) + 1;  //size array2

        int[][] array1 = createArraySxS(s);
        printArraySxS(array1);
        int[][] array2 = createArraySxS(y);
        printArraySxS(array2);
        int[][] result = addTwoArraySxS(array1, array2);
        printArraySxS(result);

    }

    static int[][] createArraySxS(int s) {
        Random rand = new Random();
        int[][] array = new int[s][s];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                // integer value in the range [ +100; +450](450 inclusive)
                array[i][j] = rand.nextInt((450) + 1) + 100;
            }
        }

        return array;
    }

    static int[][] addTwoArraySxS(int[][] array1, int[][] array2) {

        int rows = Math.max(array1.length, array2.length);
        int columns = Math.max(array1[0].length, array2[0].length);
        int[][] array3 = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int arr1 = (i < array1.length && j < array1[i].length) ? array1[i][j] : 0;
                int arr2 = (i < array2.length && j < array2[i].length) ? array2[i][j] : 0;
                array3[i][j] = arr1 + arr2;
            }
        }

        return array3;
    }

    static void printArraySxS(int[][] array) {
        System.out.println("------------------------------------");
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("\n");
        }
    }

}
