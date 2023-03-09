package homework018;

/**
 * FileName: Task01
 * Author:   Andriy Vulook
 * Date:     08.03.2023 22:01
 * Description: Enum Animals
 */


enum Animals {

    CAT(8) {
        @Override
        public String toString() {
            return name() + " Teddy is " + CAT.age + " years old";
        }
    }, DOG(12) {
        @Override
        public String toString() {
            return name() + " Archie is " + DOG.age + " years old";
        }
    }, HAMSTER(2) {
        @Override
        public String toString() {
            return name() + " Tilly is " + HAMSTER.age + " years old";
        }
    }, PARROT(3) {
        @Override
        public String toString() {
            return name() + " Bella is " + PARROT.age + " years old";
        }
    };

    private final int age;

    Animals(int age) {
        this.age = age;
    }

}

public class Task02 {

    public static void main(String[] args) {

        for (Animals animal : Animals.values()) {
            System.out.println(animal);
        }
    }

}
