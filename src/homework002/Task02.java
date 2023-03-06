package homework002;

import java.math.BigDecimal;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     26.01.2023 17:12
 * Description: Value of Pi and of Euler's number
 */

public class Task02 {

    public static void main(String[] args) {

//        ------ homework -------
        double pi = 3.141592653d;
        double euler = 2.7182818284590452d;

        System.out.println("\u03C0 = " + pi);
        System.out.println("\u2107 = " + euler);


//        ------ my test -------
        BigDecimal PI = new BigDecimal("3.14159265358979323846264338327");
        BigDecimal EULER_NUM = new BigDecimal("2.7182818284590452353602874713527");

        System.out.printf("\u03C0 = %.30f", PI);
        System.out.printf("\n");
        System.out.printf("\u2107 = %.30f", EULER_NUM);
    }

}
