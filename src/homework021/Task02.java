package homework021;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     12.03.2023 12:29
 * Description: Create a MyList class. Implement, in the simplest approximation,
 * the ability to use its instance in a similar way to an instance of the List class.
 *
 */

// MyList1 keeps objects of the type Object.
class MyList1 {
    private final List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}

// MyList2 is a generic class that can contain objects of any type specified by the type parameter T
class MyList2<T> {

    private final ArrayList<T> someList;

    public MyList2() {
        someList = new ArrayList<T>();
    }

    public void add(T item) {
        someList.add(item);
    }

    public T get(int index) {
        return someList.get(index);
    }

    public int size() {
        return someList.size();
    }
}

public class Task02 {

    public static void main(String[] args) {

        MyList1 myL_O = new MyList1();
        myL_O.add("Hello");
        myL_O.add(123);
        myL_O.add(new Date());

        System.out.println("MyList1 keeps objects of the type Object.");
        System.out.println("=>myList Object:");
        System.out.println("Element at index 0: " + myL_O.get(0));
        System.out.println("Element at index 1: " + myL_O.get(1));
        System.out.println("Element at index 2: " + myL_O.get(2));
        System.out.println("Size of the list: " + myL_O.size());

        MyList2<Integer> myL_I = new MyList2<>();
        myL_I.add(100);
        myL_I.add(200);
        myL_I.add(300);

        MyList2<String> myL_S = new MyList2<>();
        myL_S.add("One hundred");
        myL_S.add("Two hundred");
        myL_S.add("Three hundred");

        System.out.println("\nMyList2 is a generic class that can contain objects of any type specified by the type parameter T.");
        System.out.println("=>myList Integer:");
        System.out.println("Element at index 0: " + myL_I.get(0));
        System.out.println("Element at index 1: " + myL_I.get(1));
        System.out.println("Element at index 2: " + myL_I.get(2));
        System.out.println("Size of the list: " + myL_I.size());
        System.out.println("=>myList String:");
        System.out.println("Element at index 0: " + myL_S.get(0));
        System.out.println("Element at index 1: " + myL_S.get(1));
        System.out.println("Element at index 2: " + myL_S.get(2));
        System.out.println("Size of the list: " + myL_S.size());

    }

}
