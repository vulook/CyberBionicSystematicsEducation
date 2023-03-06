package homework017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     28.02.2023 16:37
 * Description: Main teacher
 */

class Teacher {
    private final String name;
    private final int rating;

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public Teacher(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " (" + rating + ")";
    }
}

class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher a, Teacher b) {
        return a.getRating() - b.getRating();
    }
}

public class Task06 {

    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ковбой Мальборо", 90));
        teachers.add(new Teacher("Надія Петрівна", 60));
        teachers.add(new Teacher("Баба Капетиха", 30));
        teachers.add(new Teacher("Любов Степанівна", 90));
        teachers.add(new Teacher("Мирон Валер'янович", 100));
        teachers.add(new Teacher("Роман Григорович", 70));
        teachers.add(new Teacher("Наталія Адамівна", 45));
        teachers.add(new Teacher("Валентина Тарасівна", 50));

        teachers.sort(new TeacherComparator());
        printList(teachers);

        System.out.println("The best teacher: " + teachers.get(teachers.size() - 1));
    }

    static void printList(List<Teacher> list) {
        System.out.println("List: ");
        for (int i = 0; i < list.size(); i++)
            System.out.println(i + ". " + list.get(i) + "  ");
        System.out.println("\n");
    }

}
