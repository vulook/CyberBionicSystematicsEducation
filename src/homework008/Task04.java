package homework008;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     20.02.2023 23:03
 * Description: overloaded methods
 */

public class Task04 {

    static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static double mean(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    static double mean(double... numbDouble) {
        double sum = 0.;
        for (double aDouble : numbDouble) {
            sum += aDouble;
        }
        return sum / numbDouble.length;
    }

    static void meanFind(double averageFromThree, double averageFromFour, double averageFromFive) {

        double[] arr = {averageFromThree, averageFromFour, averageFromFive};
        int length = arr.length;
        double min = arr[0];
        double max = arr[0];
        double average = 0;

        for (double v : arr) {

            average += v / length;

            if (v < min) {
                min = v;
            }

            if (v > max) {
                max = v;
            }
        }

        System.out.println("Min value of the " + length + " numbers: " + min);
        System.out.println("Max value of the " + length + " numbers: " + max);
        System.out.println("Get the average of the " + length + " numbers: " + average);
    }


    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.5;
        double c = 3.5;
        double d = 4.5;
        double e = 5.5;

        double averageFromThree = mean(a, b, c);
        double averageFromFour = mean(a, b, c, d);
        double averageFromFive = mean(a, b, c, d, e);

        System.out.println(averageFromThree);
        System.out.println(averageFromFour);
        System.out.println(averageFromFive);

        meanFind(averageFromThree, averageFromFour, averageFromFive);

    }

}


