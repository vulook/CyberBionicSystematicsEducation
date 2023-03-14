package homework022;

import java.util.Arrays;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     14.03.2023 11:33
 * Description: interface_comparable.
 * Add logic so that the compareTo() method searches 1) by speed, 2) by price, 3) by model name, 4) by color
 */

class Car1 implements Comparable {

    int speed;
    int price;
    String model;
    String color;

    Car1(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object obj) {
        Car1 car = (Car1) obj;
        int temp = this.speed - car.speed;
        if (temp == 0) {
            temp = this.price - car.price;
            if (temp == 0) {
                temp = this.model.compareTo(car.model);
                if (temp == 0) {
                    temp = this.color.compareTo(car.color);
                }
            }
        }
        return temp;
    }

}

public class Task03_1 {

    public static void main(String[] args) {

        Car1 c1 = new Car1(190, 8000, "BMW", "Red");
        Car1 c2 = new Car1(190, 2000, "Opel", "Black");
        Car1 c3 = new Car1(185, 10000, "Mercedes", "White");
        Car1 c4 = new Car1(220, 15000, "Audi", "Blue");
        Car1 c5 = new Car1(180, 5000, "Toyota", "Green");
        Car1 c6 = new Car1(190, 9000, "Lexus", "Silver");
        Car1 c7 = new Car1(190, 12000, "Mercedes", "Yellow");
        Car1 c8 = new Car1(195, 11000, "Ford", "Gray");
        Car1 c9 = new Car1(220, 18000, "Honda", "Orange");
        Car1 c10 = new Car1(185, 6000, "Lexus", "Purple");

        Car1[] cars = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
        System.out.println("Before sorting:");
        printCarArray(cars);

        Arrays.sort(cars);

        System.out.println("After sorting:");
        printCarArray(cars);

    }

    static void printCarArray(Car1[] array) {
        for (Car1 element : array) {
            int index = Arrays.asList(array).indexOf(element) + 1;
            System.out.println(index  + ". " + element + " ");
        }
        System.out.println("\n");
    }

}
