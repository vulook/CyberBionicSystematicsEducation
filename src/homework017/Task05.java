package homework017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     26.02.2023 0:17
 * Description: Friends
 */

public class Task05 {

    public static void main(String[] args) {

        List<String> friendList = createList();
        System.out.println("Output list: ");
        printList(friendList);

        //To use the standard sort method, call the sort() method with a null argument.
        friendList.sort(null);
        System.out.println("Standard sort method: ");
        printList(friendList);

        //shuffle() method of Collections class  shuffles the elements in the list.
        Collections.shuffle(friendList);
        System.out.println("Shuffle list: ");
        printList(friendList);

        //Stream sorted() returns a stream consisting of the elements of this stream, sorted according to natural order
        System.out.println("Stream sorted(): ");
        printList(friendList.stream().sorted().collect(Collectors.toList()));

        Collections.shuffle(friendList);
        System.out.println("Shuffle list: ");
        printList(friendList);

        // sort() method of Collections class sorts the elements of the List in ascending order of their natural ordering.
        Collections.sort(friendList);
        System.out.println("Sort() method of Collections class: ");
        printList(friendList);
    }

    static List<String> createList() {
        List<String> friends = new ArrayList<>();
        friends.add("Svitlana");
        friends.add("Polina");
        friends.add("Liliya");
        friends.add("Stepan");
        friends.add("Ivan");
        friends.add("Maksym");
        friends.add("Ganna");
        friends.add("Mykhaylo");
        return friends;
    }

    static void printList(List<String> list) {
        System.out.print(" ==> ");
        for (int i = 0; i < list.size(); i++)
            System.out.print(i + "." + list.get(i) + "  ");
        System.out.println("\n");
    }

}
