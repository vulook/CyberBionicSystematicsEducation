package homework014;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     07.03.2023 14:21
 * Description: MyArea
 */

class MyArea {
    private static final float PI_NUMBER = 3.14F;

    private static double r;

    public static void areaOfCircle(double r) {
        double area = r * r * PI_NUMBER;
        System.out.println("The area of the circle [radius = " + r + "]: " + area);
    }

}

public class Task05 {

    public static void main(String[] args) {

        double radius = Math.random();

        MyArea.areaOfCircle(radius);

    }

}
