package homework021;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     12.03.2023 16:13
 * Description: Create a MyDictionary class and implement the minimum necessary interface to use its instance.
 *
 */

class MyDictionary<K, V> {
    private final List<K> keys;
    private final List<V> values;

    public MyDictionary() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    // Method for adding a key-value pair to the dictionary
    public void add(K key, V value) {
        this.keys.add(key);
        this.values.add(value);
    }

    // Method for getting a value from the dictionary using an index
    public V get(int index) {
        if (index >= 0 && index < this.keys.size()) {
            return this.values.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    // Method for getting the index of a key in the dictionary
    public int getIndex(K key) {
        int index = this.keys.indexOf(key);
        if (index >= 0) {
            return index;
        } else {
            System.out.print("Key not found.  ");
            return -1;
        }
    }

    // Method for getting the size of the dictionary
    public int size() {
        return this.keys.size();
    }

    // Method for removing a key-value pair from the dictionary using an index
    public void remove(int index) {
        this.keys.remove(index);
        this.values.remove(index);
    }

}

public class Task03 {
    public static void main(String[] args) {

        MyDictionary<Integer, String> dictionary = new MyDictionary<>();
        dictionary.add(100, "one hundred");
        dictionary.add(200, "two hundred");
        dictionary.add(300, "three hundred");
        dictionary.add(400, "four hundred");
        dictionary.add(500, "five hundred");

        System.out.println("Size of dictionary: " + dictionary.size());
        System.out.println("Value at index 0: " + dictionary.get(0));
        System.out.println("Value at index 1: " + dictionary.get(1));
        System.out.println("Value at index 2: " + dictionary.get(2));
        System.out.println("Value at index 3: " + dictionary.get(3));
        System.out.println("Value at index 4: " + dictionary.get(4));

        System.out.println("\nRemoving the first two elements...");
        dictionary.remove(0);
        dictionary.remove(0);
        System.out.println("Size of dictionary after removing element: " + dictionary.size());

        System.out.println("Get the index of the key 100: " + dictionary.getIndex(100));
        System.out.println("Get the index of the key 500: " + dictionary.getIndex(500));

        System.out.println("Value at index 0 removing element: " + dictionary.get(0));
        System.out.println("Value at index 4 removing element... ");
        dictionary.get(4); //IndexOutOfBoundsException: Invalid index: 4

    }

}





