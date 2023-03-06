package homework006;

import java.util.Scanner;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     16.02.2023 16:55
 * Description: find the sum 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)
 */

public class Task06 {

    public static void main(String[] args) {

        int N;
        System.out.println("Find the sum: 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter positive number N: ");
        N = s.nextInt();

        System.out.println("The Sum terms of series is ==> " + String.format("%.3f", calculationSum(N)));

    }

    static double calculationSum(int N) {
        double sum = 0.0;

        for (int i = 1; i <= N; i++) {
            sum += (double) 1 / factorial(i);
        }
        return 1 + sum;
    }

    static long factorial(int N) {
        long factorial = 1;

        if (N == 0) {
            return 1;
        } else {
            do {
                factorial *= N--;
            } while (N > 0);
        }
        return factorial;
    }

}
