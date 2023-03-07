package homework014;

/**
 * FileName: Task01
 * Author:   Andriy Vulook
 * Date:     07.03.2023 3:04
 * Description: Class Car
 */

class Car1 {

    private int year;

    private String color;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car1() {
    }

    public Car1(int year) {
        this.year = year;
        this.color = "";
    }

    public Car1(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Year: " + getYear() + ", Color: " + getColor();
    }

    public void print() {
        System.out.println(this);
    }

}
public class Task02 {

    public static void main(String[] args) {

        System.out.println("List of cars");

        Car1 car1 = new Car1();
        car1.setYear(2015);
        car1.setColor("black");
        car1.print();

        Car1 car2 = new Car1(2012);
        car2.setColor("green");
        car2.print();

        Car1 car3 = new Car1(2020, "white");
        car3.print();

    }

}
