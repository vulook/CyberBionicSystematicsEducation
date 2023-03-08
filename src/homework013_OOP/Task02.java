package homework013_OOP;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     07.03.2023 17:05
 * Description: Find the Area and Perimeter of a Rectangle
 */

class Rectangle {

    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    public double perimeterCalculator() {
        return 2 * (side1 + side2);
    }

    @Override
    public String toString() {
        return "Side1: " + getSide1() + ", Side2: " + getSide2();
    }

}

public class Task02 {

    public static void main(String[] args) {

        double x = (Math.random() + 1) * 10;
        double y = (Math.random() + 1) * 10;
        double area;
        double perimeter;

        Rectangle rectangle = new Rectangle(x, y);
        area = rectangle.areaCalculator();
        perimeter = rectangle.perimeterCalculator();

        System.out.println("Side1 = " + x + ", Side2 = " + y);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }

}
