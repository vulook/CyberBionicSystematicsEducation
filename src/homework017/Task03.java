package homework017;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     25.02.2023 16:13
 * Description: remove 3, 5, 7 animals
 */

public class Task03 {

    public static void main(String[] args) {
        List<String> animalList = createList();
        printList(animalList);
        System.out.println("list size: " + animalList.size());

        animalList.remove("Elephant");
        animalList.remove("Rhinoceros");
        animalList.remove("Panther");
        printList(animalList);
        System.out.println("list size: " + animalList.size());

        animalList.remove(4);
        animalList.remove(2);
        printList(animalList);
        System.out.println("list size: " + animalList.size());

        animalList.remove(2);
        animalList.remove("Giraffe");
        printList(animalList);
        System.out.println("list size: " + animalList.size());

    }

    static List<String> createList() {
        List<String> animals = new ArrayList<>();
        animals.add("Crocodile");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Rhinoceros");
        animals.add("Lynx");
        animals.add("Horse");
        animals.add("Rabbit");
        animals.add("Panther");

        return animals;
    }

    static void printList(List<String> list) {
        System.out.println("------------------------------------");
        for (String element : list) System.out.print(list.indexOf(element) + "." + element + " ");
        System.out.println("");
    }


}
