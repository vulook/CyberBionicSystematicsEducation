package homework004;

import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     04.02.2023 18:19
 * Description: number
 */

public class Task05 {
    public static void main(String[] args) {

        int result;
        System.out.println("Enter an integer number: ");
        Scanner in = new Scanner(System.in);
        System.out.print("IN => ");
        int number = in.nextInt();

        result = (number > 0) ? number + 1 : number - 2;
        System.out.print("OUT=> ");
        System.out.println(result);
    }

}
