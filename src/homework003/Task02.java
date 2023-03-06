package homework003;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     29.01.2023 13:43
 * Description: arithmetic average of three integer values
 */


class ArithmeticAverage {

    double calAvg;

    public ArithmeticAverage(int a, int b, int c) {
        calAvg = (double)(a + b + c) / 3;
    }
}

public class Task02 {

    public static void main(String[] args) {

        int number1 = 1050;
        int number2 = 8;
        int number3 = -351;

        ArithmeticAverage obj = new ArithmeticAverage(number1, number2, number3);
        System.out.println("The average of three number is " + obj.calAvg);

    }

}
