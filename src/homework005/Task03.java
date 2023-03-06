package homework005;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     13.02.2023 0:37
 * Description: LogicOperations
 */

public class Task03 {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;

        x += y >> x++ * z;
/*
        x += (y >> ((x++) * z));
        x += 10 >> 75
                     ==> shifts the number 10 to the right by 75 digits
                     ==> divide the number 10 by 2 to the power of 75 - see BitOperations ();
        x = 5 + 0
        x = 5
*/
        System.out.println(BitOperations());
        System.out.println("x1 = " + x);
        System.out.println("y1 = " + y);
        System.out.println("z1 = " + z);

        z = ++x & y * 5;
 /*
        z = (++x) & (y * 5);
        z = 6 & 50;
                   0011 0010
                   0000 0110
                   0000 0010
        z = 2
*/
        System.out.println("x2 = " + x);
        System.out.println("y2 = " + y);
        System.out.println("z2 = " + z);

        y /= x + 5 | z;
/*
        y /= ((x + 5) | z);
        y /= 11 | 2;
                   1011
                   0010
                   1011
        y / = 11
        y = 10/11
        y = 0
*/
        System.out.println("x3 = " + x);
        System.out.println("y3 = " + y);
        System.out.println("z3 = " + z);

        z = x++ & y * 5;
/*
        z = (x++) & (y * 5);
        z = 7 & 0
                  0111
                  0000
                  0000
        z = 0
*/
        System.out.println("x4 = " + x);
        System.out.println("y4 = " + y);
        System.out.println("z4 = " + z);

        x = y << x++ ^ z;

/*
        x = (y << (x++)) ^ z;
        x = (0 << 8) ^ 0;
        x = 0 ^ 0
                  0000
                  0000
                  0000
        x = 0
*/
        System.out.println("x5 = " + x);
        System.out.println("y5 = " + y);
        System.out.println("z5 = " + z);

    }
    public static String BitOperations () {
        String shiftOperationResult = "(10 >> 75) = ";
        int devideOperationResult = 10 / (int) Math.pow(2, 75);
        return shiftOperationResult + devideOperationResult;
    }

}
