package homework014;

/**
 * FileName: Task01
 * Author:   Andriy Vulook
 * Date:     07.03.2023 3:04
 * Description: Class Car
 */

class Car {
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

    public Car() {
    }

    public Car(int year) {
        this.year = year;
        color = "";
    }

    public Car(int year, String color) {
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

        Car car1 = new Car();
        car1.setYear(2015);
        car1.setColor("black");
        car1.print();

        Car car2 = new Car(2012);
        car2.setColor("green");
        car2.print();

        Car car3 = new Car(2020, "white");
        car3.print();

    }

}
