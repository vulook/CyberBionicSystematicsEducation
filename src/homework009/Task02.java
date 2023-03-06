package homework009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     21.02.2023 15:46
 * Description: CustomerArray!
 */

public class Task02 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length of array [for example 10]: ");
        int length = Integer.parseInt(br.readLine());
        if (length < 0) {
            System.out.println("Вad array length!");
            System.exit(0);
        }

        int[] arrayInt = createArray(length);
        int min = calcMIN(arrayInt);
        System.out.println("MIN: " + min);
        int max = calcMAX(arrayInt);
        System.out.println("MAX: " + max);
        int sum = calcSUM(arrayInt);
        System.out.println("SUM: " + sum);
        double avg = ((double) sum / arrayInt.length);
        System.out.println("AVG: " + String.format("%.2f", avg));
        select_ODD_inArray(arrayInt);
    }

    static int[] createArray(int length) {
        Random random = new Random();
        int[] arrayInt = new int[length];

        for (int i = 0; i < arrayInt.length; i++)
            arrayInt[i] = random.nextInt(length * 10);

        System.out.println("Array of integers: ");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.print(arrayInt[i]);
            }
        }
        System.out.print("\n");
        return arrayInt;
    }

    static int calcMIN(int[] array) {
        int min = 0;
        if (array.length == 0) {
            System.out.println("array is empty!");
        } else {
            min = array[0];
            for (int j : array) {
                if (min > j) min = j;
            }
        }
        return min;
    }

    static int calcMAX(int[] array) {
        int max = 0;
        if (array.length == 0) {
            System.out.println("array is empty!");
        } else {
            max = array[0];
            for (int j : array) {
                if (max < j) max = j;
            }
        }
        return max;
    }

    public static int calcSUM(int[] array) {
        int sum = 0;
        if (array.length == 0) {
            System.out.println("array is empty!");
        } else {
            for (int j : array) {
                sum += j;
            }
        }
        return sum;
    }

    public static void select_ODD_inArray(int[] array) {
        StringBuilder sb = new StringBuilder();

        if (array.length == 0) {
            System.out.println("array is empty!");
        } else {
            for (int j : array) {
                if (j % 2 == 1) {
                    sb.append(j).append(", ");
                }
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 2);
            System.out.println("ODD numbers: " + sb);
        } else {
            System.out.println("This array contains no odd values!");
        }
    }

}
