package homework003;

/**
 * FileName: Task01
 * Author:   Andriy Vulook
 * Date:     28.01.2023 23:35
 * Description: Pre-increment and Post-decrement
 */

public class Task01 {

    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        x += y - x++ * z;

/*
        x += 12 - 30
        x = 10 - 18
        x = -8
*/

        System.out.println("x1 = " + x);
        System.out.println("y1 = " + y);
        System.out.println("z1 = " + z);

        z = --x - y * 5;

/*
        z = -9 - 60
        z = -69
*/

        System.out.println("x2 = " + x);
        System.out.println("y2 = " + y);
        System.out.println("z2 = " + z);

        y /= x + 5 % z;

 /*
        y /= -9 + 5
        y = 12 / -4
        y = -3
*/

        System.out.println("x3 = " + x);
        System.out.println("y3 = " + y);
        System.out.println("z3 = " + z);

        z = x++ + y * 5;

 /*
        z = -9 + (-15)
        z = -24
*/

        System.out.println("x4 = " + x);
        System.out.println("y4 = " + y);
        System.out.println("z4 = " + z);

        x = y - x++ * z;

 /*
        x = -3 - (-8 * -24)
        x = -3 - 192
        x= - 195
*/

        System.out.println("x5 = " + x);
        System.out.println("y5 = " + y);
        System.out.println("z5 = " + z);

    }

}
