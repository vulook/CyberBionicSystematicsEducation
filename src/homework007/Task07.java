package homework007;

import java.util.Scanner;

/**
 * FileName: Task07
 * Author:   Andriy Vulook
 * Date:     20.02.2023 6:25
 * Description: Calculator
 */

public class Task07 {

    public static void main(String[] args) {

        int numb1;
        int numb2;
        int numb3;

        System.out.println("Find the average of 3 numbers ...");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        numb1 = s.nextInt();
        System.out.print("Enter the second number: ");
        numb2 = s.nextInt();
        System.out.print("Enter the third number: ");
        numb3 = s.nextInt();

        calculate(numb1, numb2, numb3);

    }

    static void calculate(int numb1, int numb2, int numb3) {
        double result;
        result = (double) (numb1 + numb2 + numb3) / 3;
        System.out.println("The average of three numbers is: " + result);
    }

}
