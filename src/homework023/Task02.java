package homework023;

import java.util.*;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     14.03.2023 17:38
 * Description: Using a collection, double the word
 */

public class Task02 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter letters/words/numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter no." + (i + 1) + ":");
            if (s.hasNextLine()) {
                String line = s.nextLine();
                words.add(line);
            }
        }

        printList(words);

        printList(doubleValues1(words));
        printList(doubleValues2(words));
        printList(doubleValues3(words));

    }

    static List<String> doubleValues1(List<String> words) {
        List<String> wordsX2 = new ArrayList<>();
        for (String word : words) {
            wordsX2.add(word + " " + word);
        }
        return wordsX2;
    }

    public static List<String> doubleValues2(List<String> words) {
        List<String> wordsX2 = new ArrayList<>(words.size() * 2);
        for (String word : words) {
            wordsX2.addAll(Collections.nCopies(2, word));
        }
        return wordsX2;
    }

    static List<String> doubleValues3(List<String> words) {
        List<String> wordsX2 = new ArrayList<>();
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            wordsX2.add(word);
            wordsX2.add(word);
        }
        return wordsX2;
    }

    static void printList(List<String> list) {
        System.out.print("Dual output: ");
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

}

