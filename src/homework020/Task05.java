package homework020;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     12.03.2023 2:19
 * Description: Create class Animal with name String, int age, tail Boolean.
 */

@Data
@AllArgsConstructor //generates a constructor with all parameters
class Animal {
    private String name;
    private int age;
    private boolean hasTail;

    @Override
    public String toString() {
        return "Animal: Name: " + name + ", age: " + age + ", tail: " + (hasTail ? "yes" : "no");
    }

    public void print() {
        System.out.println(this);
    }
}

public class Task05 {

    public static void main(String[] args) {

        Animal cat1 = new Animal("Rocket", 8, true);
        Animal cat2 = new Animal("Fairy", 8, true);
        Animal gibbon1 = new Animal("Simba", 5, false);
        Animal gibbon2 = new Animal("Benny", 3, false);

        cat1.print();
        System.out.println(cat1.hashCode());
        cat2.print();
        System.out.println(cat2.hashCode());
        System.out.println(cat1.equals(cat2));
        System.out.println();

        gibbon1.print();
        System.out.println(gibbon1.hashCode());
        gibbon2.print();
        System.out.println(gibbon2.hashCode());
        System.out.println(gibbon1.equals(gibbon2));
        System.out.println(gibbon1.equals(new Animal("Simba", 5, false)));
    }

}
