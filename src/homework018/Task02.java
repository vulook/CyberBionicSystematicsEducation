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
            return "Cat Teddy is " + this.age + " years old";
        }
    }, DOG(12) {
        @Override
        public String toString() {
            return "Dog Archie is " + this.age + " years old";
        }
    }, HAMSTER(2) {
        @Override
        public String toString() {
            return "Hamster Tilly is " + this.age + " years old";
        }
    }, PARROT(3) {
        @Override
        public String toString() {
            return "Parrot Bella is " + this.age + " years old";
        }
    };

    protected final int age;

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
