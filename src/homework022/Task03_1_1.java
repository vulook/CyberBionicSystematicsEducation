package homework022;

import java.util.Arrays;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     15.03.2023 09:33
 * Description: interface_comparable.
 * Add logic so that the compareTo() method searches 1) by speed, 2) by price, 3) by model name, 4) by color
 * implements Comparable, specifying the type via generics: Comparable<CarNew>
 *
 */

class CarNew implements Comparable<CarNew> {

    int speed;
    double price;
    String model;
    String color;

    CarNew(int speed, double price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(CarNew o) {
        int temp = Integer.compare(this.speed, o.speed);
        if (temp == 0) {
            temp = Double.compare(this.price, o.price);
            if (temp == 0) {
                temp = this.model.compareTo(o.model);
                if (temp == 0) {
                    temp = this.color.compareTo(o.color);
                }
            }
        }
        return temp;
    }

}

public class Task03_1_1 {

    public static void main(String[] args) {

        CarNew c1 = new CarNew(190, 8000.5, "BMW", "Red");
        CarNew c2 = new CarNew(190, 2000.9, "Opel", "Black");
        CarNew c3 = new CarNew(185, 10000.0, "Mercedes", "White");
        CarNew c4 = new CarNew(220, 15000.8, "Audi", "Blue");
        CarNew c5 = new CarNew(180, 5000.0, "Toyota", "Green");
        CarNew c6 = new CarNew(190, 9000.4, "Lexus", "Silver");
        CarNew c7 = new CarNew(190, 12000.2, "Mercedes", "Yellow");
        CarNew c8 = new CarNew(195, 11000.0, "Ford", "Gray");
        CarNew c9 = new CarNew(220, 18000.3, "Honda", "Orange");
        CarNew c10 = new CarNew(185, 6000.6, "Lexus", "Purple");

        CarNew[] cars = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
        System.out.println("Before sorting:");
        printCarArray(cars);

        Arrays.sort(cars);

        System.out.println("After sorting:");
        printCarArray(cars);

    }

    static void printCarArray(CarNew[] array) {
        for (CarNew element : array) {
            int index = Arrays.asList(array).indexOf(element) + 1;
            System.out.println(index  + ". " + element + " ");
        }
        System.out.println("\n");
    }

}
