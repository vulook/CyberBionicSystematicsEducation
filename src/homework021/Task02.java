package homework021;

import java.util.ArrayList;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     12.03.2023 12:29
 * Description: Create a MyList class.
 * Implement in the simplest approximation the possibility of using its instance similarly to an instance of the List class.
 */

class MyList<T> {

    private final ArrayList<T> newList;

    public MyList() {
        newList = new ArrayList<T>();
    }

    public void add(T item) {
        newList.add(item);
    }

    public T get(int index) {
        return newList.get(index);
    }

    public int size() {
        return newList.size();
    }
}

public class Task02 {

    public static void main(String[] args) {

        MyList<Integer> myListInt = new MyList<>();
        myListInt.add(100);
        myListInt.add(200);
        myListInt.add(300);

        System.out.println("myList Integer:");
        System.out.println("Element at index 0: " + myListInt.get(0));
        System.out.println("Element at index 1: " + myListInt.get(1));
        System.out.println("Element at index 2: " + myListInt.get(2));
        System.out.println("Size of the list: " + myListInt.size());

        MyList<String> myListStr = new MyList<>();
        myListStr.add("One hundred");
        myListStr.add("Two hundred");
        myListStr.add("Three hundred");

        System.out.println("myList String:");
        System.out.println("Element at index 0: " + myListStr.get(0));
        System.out.println("Element at index 1: " + myListStr.get(1));
        System.out.println("Element at index 2: " + myListStr.get(2));
        System.out.println("Size of the list: " + myListStr.size());


    }
}
