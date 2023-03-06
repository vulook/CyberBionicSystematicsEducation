package homework006;

import java.util.Scanner;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     16.02.2023 13:26
 * Description: Printing_Shapes
 */

public class Task03 {

    public static void main(String[] args) {

        int rows;
        System.out.println("... see Star Patterns.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = s.nextInt();

        printRectangle(rows);
        printRightTrianlge(rows);
        printPyramidTriangle(rows);
        printDiamondShape(rows);

    }

    static void printRectangle(int rows) {
        System.out.print("\nprint Rectangle:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printRightTrianlge(int rows) {
        System.out.print("\nprint Right Trianlge:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPyramidTriangle(int rows) {
        System.out.print("\nprint Pyramid Triangle:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printDiamondShape(int rows) {
        System.out.print("\nprint DiamondShape:\n");

        int space;

        space = rows - 1;
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            space--;
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        space = 1;
        for (int j = 1; j <= rows - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            space++;
            for (int i = 1; i <= 2 * (rows - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
