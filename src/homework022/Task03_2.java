package homework022;

import java.util.Arrays;
import java.util.Comparator;

/**
 * FileName: Task03_2
 * Author:   Andriy Vulook
 * Date:     14.03.2023 16:50
 * Description: interface_comparator_with_anonymous
 * Add logic so that the compareTo() method searches 1) by speed, 2) by price, 3) by model name, 4) by color
 */

class Car2 {
    int speed;
    int price;
    String model;
    String color;

    Car2(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }
}

public class Task03_2 {

    public static void main(String[] args) {

        Car2 c1 = new Car2(190, 8000, "BMW", "Red");
        Car2 c2 = new Car2(140, 2000, "Opel", "Black");
        Car2 c3 = new Car2(185, 10000, "Mercedes", "White");
        Car2 c4 = new Car2(280, 5000, "Toyota", "Blue");
        Car2 c5 = new Car2(190, 6000, "Opel", "Green");
        Car2 c6 = new Car2(190, 7000, "BMW", "Yellow");
        Car2 c7 = new Car2(185, 3000, "Ford", "Orange");
        Car2 c8 = new Car2(260, 8000, "BMW", "Purple");
        Car2 c9 = new Car2(190, 4000, "Opel", "Pink");
        Car2 c10 = new Car2(190, 1000, "Opel", "Gray");

        Car2[] cars = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
        System.out.println("Before sorting:");
        printCarArray(cars);

        Arrays.sort(cars, new Comparator<Car2>() {
            public int compare(Car2 car1, Car2 car2) {
                int temp = car1.speed - car2.speed;
                if (temp == 0) {
                    temp = car1.price - car2.price;
                    if (temp == 0) {
                        temp = car1.model.compareTo(car2.model);
                        if (temp == 0) {
                            temp = car1.color.compareTo(car2.color);
                        }
                    }
                }
                return temp;
            }
        });

        System.out.println("After sorting:");
        printCarArray(cars);

    }

    static void printCarArray(Car2[] array) {
        for (Car2 element : array) {
            int index = Arrays.asList(array).indexOf(element) + 1;
            System.out.println(index + ". " + element + " ");
        }
        System.out.println("\n");
    }

}
