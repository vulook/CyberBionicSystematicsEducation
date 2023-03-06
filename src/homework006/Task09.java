package homework006;

import java.util.Scanner;

/**
 * FileName: Task09
 * Author:   Andriy Vulook
 * Date:     18.02.2023 15:25
 * Description: Fibonacci Series
 */

public class Task09 {

    public static void main(String[] args) {

        int low;
        int high;
        System.out.println("Find the Fibonacci series in a range entered by the user:");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the low value: ");
        low = s.nextInt();
        System.out.println("Enter the high value: ");
        high = s.nextInt();

        writeFibonacciSeries(checkCondition(low, high));

    }

    static int[] checkCondition(int low, int high) {
        int lowTemp = low;
        int highTemp = high;
        int[] condition = new int[2];

        if (low < high) {
            System.out.println("Correct data entered! low = " + low + ", high = " + high);
        } else if (low > high) {
            low = highTemp;
            high = lowTemp;
            System.out.println("Incorrect data entered! But that's fixed: low = " + low + ", high = " + high);
        } else if (low == high) {
            low = 0;
            System.out.println("Incorrect data entered! But that's fixed: low = " + low + ", high = " + high);
        } else {
            System.out.println("Incorrect data entered!");
        }

        condition[0] = low;
        condition[1] = high;
        return condition;
    }

    static void writeFibonacciSeries(int[] condition) {
        int low = condition[0];
        int high = condition[1];
        System.out.println("The Fibonacci numbers are between " + low + " & " + high + ": ");

        int first = 0,  second = 1;
        while (first <= high) {
            if (first >= low) {
                System.out.print(first + " ");
            }
            int nextTerm = first +  second;
            first =  second;
            second = nextTerm;
        }
    }

}
