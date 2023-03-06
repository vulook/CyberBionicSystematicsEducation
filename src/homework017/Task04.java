package homework017;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     25.02.2023 18:14
 * Description: ListIterator for list
 */

public class Task04 {

    public static void main(String[] args) {

        int amount = 10;
        List<Integer> list = createList(amount);
        printList(list);

        ListIterator<Integer> itr = list.listIterator();
        System.out.println("cursor position: " + itr.previousIndex());
        while (itr.hasNext()) {
            int value = itr.next();
            itr.set(value + 1);
        }
        printList(list);
        System.out.println("cursor position: " + itr.previousIndex());

    }

    static List<Integer> createList(int n) {
        List<Integer> listR = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < n; i++) listR.add(rd.nextInt((n * 20) + 1) - n * 10);
        return listR;
    }

    static void printList(List<Integer> list) {
        System.out.println("------------------------------------");
        for (int element : list) System.out.print(element + " ");
        System.out.println(" ");
    }

}
