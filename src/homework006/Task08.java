package homework006;

import java.util.Scanner;

/**
 * FileName: Task08
 * Author:   Andriy Vulook
 * Date:     18.02.2023 14:51
 * Description: Rectangle
 */

public class Task08 {

    public static void main(String[] args) {

        int high = 0;
        int width = 0;

        System.out.println("See Star Rectangle (input height + width).");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the high: ");
        high = s.nextInt();
        System.out.println("Enter the width: ");
        width = s.nextInt();

        printRectangle(high, width);

    }

    static void printRectangle(int high, int width) {
        System.out.print("\nprint Rectangle:\n");
        if (high > 0 && width > 0) {
            for (int i = 1; i <= high; i++) {
                for (int j = 1; j <= width; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Bullshit entered!");
        }
    }

}
