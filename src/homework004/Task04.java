package homework004;

import java.util.Scanner;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     01.02.2023 18:39
 * Description: positive number
 */

public class Task04 {

    public static void main(String[] args) {

        int result;
        System.out.println("Enter an integer number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        result = (number > 0) ? number + 1 : number;
        System.out.println(result);
    }

}
