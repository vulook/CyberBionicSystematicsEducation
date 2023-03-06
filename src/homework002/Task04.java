package homework002;

import java.util.Scanner;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     26.01.2023 21:27
 * Description: logical data type
 */

public class Task04 {

    public static void main(String[] args) {

        boolean true_grass;
        String true_color = "green grass";
        String color1 = "red grass";
        String color2 = "orange grass";
        String color3 = "yellow grass";
        String color4 = "green grass";
        String color5 = "blue grass";
        String color6 = "indigo grass";
        String color7 = "violet grass";

        System.out.println("Choose the true color of grass (1-7):");
        System.out.println(" 1 = red;");
        System.out.println(" 2 = orange;");
        System.out.println(" 3 = yellow;");
        System.out.println(" 4 = green;");
        System.out.println(" 5 = blue;");
        System.out.println(" 6 = indigo;");
        System.out.println(" 7 = violet. \n");
        System.out.print("Enter the color number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.print("You have chosen ");
        if (number == 1) {
            System.out.print(color1);
            System.out.print(". It's a color => ");
            true_grass = color1.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number == 2) {
            System.out.print(color2);
            System.out.print(". It's a color => ");
            true_grass = color2.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number == 3) {
            System.out.print(color3);
            System.out.print(". It's a color => ");
            true_grass = color3.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number == 4) {
            System.out.print(color4);
            System.out.print(". It's a color => ");
            true_grass = color4.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number == 5) {
            System.out.print(color5);
            System.out.print(". It's a color => ");
            true_grass = color5.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number == 6) {
            System.out.print(color6);
            System.out.print(". It's a color => ");
            true_grass = color6.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number == 7) {
            System.out.print(color7);
            System.out.print(". It's a color => ");
            true_grass = color7.equals(true_color) ? true : false;
            System.out.print(true_grass);
        }

        if (number < 1 || number > 7) {
            System.out.println("some bullshit. Read the condition again");
        }
    }

}
