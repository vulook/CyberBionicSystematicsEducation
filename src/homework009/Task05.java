package homework009;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     25.02.2023 11:04
 * Description: array's manipulation
 */

public class Task05 {

    public static void main(String[] args) {
        int[][] array1 = new int[3][3];

        array1[0][0] = 2;
        array1[0][1] = 4;
        array1[0][2] = 6;

        array1[1][0] = 8;
        array1[1][1] = 10;
        array1[1][2] = 12;

        array1[2][0] = 14;
        array1[2][1] = 16;
        array1[2][2] = 18;

        int[][] array2 = new int[3][3];

        array2[0][0] = 1;
        array2[0][1] = 3;
        array2[0][2] = 5;

        array2[1][0] = 7;
        array2[1][1] = 9;
        array2[1][2] = 11;

        array2[2][0] = 13;
        array2[2][1] = 15;
        array2[2][2] = 17;

        int[][] result = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("------------");
        for (int[] a : result) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
    }

}
