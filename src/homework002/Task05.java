package homework002;

import java.net.StandardSocketOptions;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     27.01.2023 13:51
 * Description: variable of type byte
 */

public class Task05 {

    public static void main(String[] args) {

        int number_integer = 99999;
        byte number_byte;

        number_byte = (byte) number_integer;
        System.out.println("byte value = " + number_byte);


/*
        to binary
        99999 = 0000 0000 0000 0001 1000 0110 1001 1111
        = 1001 1111 (truncated)
        = 0110 0000 (negated)
        = 0110 0001 (negated plus one)
        = 97 (decimal after negated plus one)
        = -97 (hence, decimal original)
*/

    }
}




