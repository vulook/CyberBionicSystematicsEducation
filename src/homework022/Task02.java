package homework022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     14.03.2023 11:03
 * Description: Output of List items in the console.
 */

public class Task02 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i + (int) (Math.random() * (i * 100)));
        }

        printListUseIterator(list);
    }

    static void printListUseIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        if (iterator.hasNext()) {
            do {
                int element = iterator.next();
                System.out.print(element + " ");
            } while (iterator.hasNext());
        }
    }

}
