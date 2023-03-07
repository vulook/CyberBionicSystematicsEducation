package homework014;

import lombok.*;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     07.03.2023 10:55
 * Description: Car + 4 parameters
 */

@Getter
@Setter
@NoArgsConstructor //generates a constructor without parameters
@AllArgsConstructor //generates a constructor with all parameters
@ToString
class Car2 {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car2(int year) {
        this.year = year;
        speed = 0.;
        weight = 0;
        color = "";
    }

    public Car2(int year, double speed) {
        this.year = year;
        this.speed = speed;
        weight = 0;
        color = "";
    }

    public Car2(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        color = "";
    }

    public void print() {
        System.out.println(this);
    }
}

public class Task03 {

    public static void main(String[] args) {

        System.out.println("ListCAR2:");

        Car2 car1 = new Car2();
        car1.setYear(2014);
        car1.setSpeed(200.0);
        car1.setWeight(2224);
        car1.setColor("black");
        car1.print();

        Car2 car2 = new Car2(2012);
        car2.setSpeed(220.5);
        car2.setWeight(2552);
        car2.setColor("green");
        car2.print();

        Car2 car3 = new Car2(2008, 160.6);
        car3.setWeight(3100);
        car3.setColor("indigo");
        car3.print();

        Car2 car4 = new Car2(2021, 260.6, 1958);
        car4.setColor("violet");
        car4.print();

        Car2 car5 = new Car2(2017, 240.8, 2103, "orange");
        car5.print();
    }

}
