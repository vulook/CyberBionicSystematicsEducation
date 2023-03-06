package homework003;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     29.01.2023 20:51
 * Description: calculating the volume of cylinder
 */

public class Task04 {

    public static void main(String[] args) {

        double r = 4;
        double h = 15;
        double v, s;

//  ------ Volume of Cylinder = PI X Radius X Radius X Height -------

        v = Math.PI * r * r * h;
        System.out.println("Volume of Cylinder = " + String.format("%.2f.", v));

//  ------- Total surface area of Cylinder = 2 X PI X Radius X (Radius + Height) -------

        s = 2 * Math.PI * r * (r + h);
        System.out.println("Surface Area of Cylinder = " + String.format("%.2f.", s));

    }

}
