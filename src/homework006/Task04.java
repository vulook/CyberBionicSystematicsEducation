package homework006;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     16.02.2023 14:33
 * Description:  Delivery
 */

public class Task04 {

    public static void main(String[] args) {

        int N = 14;
        System.out.println("Factorial of " + N + " is " + factorial(N));

    }

    static long factorial(int N) {
        long factorial = 1;

        if (N == 0) {
            return 1;
        } else {
            do {
                factorial *= N--;
            } while (N > 0);
        }
        return factorial;
    }

}
