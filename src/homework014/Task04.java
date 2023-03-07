package homework014;

import lombok.*;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     07.03.2023 13:03
 * Description: Car and calling the constructor from the constructor.
 */

@Getter
@Setter
@ToString
class Car3 {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car3() {}

    public Car3(int year) {
        this();
        this.year = year;
    }

    public Car3(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car3(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car3(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }
}

public class Task04 {

    public static void main(String[] args) {

        System.out.println("ListCAR3:");

        Car3 car5 = new Car3();
        car5.setYear(2019);
        car5.setSpeed(280.4);
        car5.setWeight(2100);
        car5.setColor("ultramarine");
        car5.print();

        Car3 car1 = new Car3(1998);
        car1.setSpeed(140.8);
        car1.setWeight(2644);
        car1.setColor("magenta");
        car1.print();

        Car3 car2 = new Car3(2000, 160.0);
        car2.setWeight(1800);
        car2.setColor("tangerine");
        car2.print();

        Car3 car3 = new Car3(2012, 180.0, 2222);
        car3.setColor("raspberry");
        car3.print();

        Car3 car4 = new Car3(2020, 320.0, 2555, "amber");
        car4.print();
    }

}
