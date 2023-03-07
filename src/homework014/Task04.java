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

    public Car3(int year) {
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

        Car3 car1 = new Car3(1998);
        car1.setSpeed(140.8);
        car1.setWeight(2644);
        car1.setColor("magenta");
        car1.print();

        Car3 car2 = new Car3(2000, 160.0);
        car1.setWeight(1800);
        car1.setColor("tangerine");
        car2.print();

        Car3 car3 = new Car3(2012, 180.0, 2222);
        car3.setColor("raspberry");
        car3.print();

        Car3 car4 = new Car3(2020, 320.0, 2555, "amber");
        car4.print();
    }

}
