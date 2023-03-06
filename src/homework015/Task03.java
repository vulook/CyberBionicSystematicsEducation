package homework015;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     06.03.2023 10:59
 * Description: Plane, Саг and Ship extends Vehicle
 */


class Vehicle {
    private double x;
    private double y;
    private double cost;
    private double speed;
    private int year;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCost() {
        return cost;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public Vehicle(double x, double y, double cost, double speed, int year) {
        this.x = x;
        this.y = y;
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }
}

    class Plane extends Vehicle {
        private double height;
        private int passengers;


        public double getHeight() {
            return height;
        }

        public int getPassengers() {
            return passengers;
        }

        public Plane(double x, double y, double cost, double speed, int year, double height, int passengers) {
            super(x, y, cost, speed, year);
            this.height = height;
            this.passengers = passengers;
        }
    }

    class Ship extends Vehicle {
        private int passengers;
        private String port;


        public int getPassengers() {
            return passengers;
        }

        public String getPort() {
            return port;
        }

        public Ship(double x, double y, double cost, double speed, int year, int passengers, String port) {
            super(x, y, cost, speed, year);
            this.passengers = passengers;
            this.port = port;
        }
    }

    class Car extends Vehicle {

        public Car(double x, double y, double cost, double speed, int year) {
            super(x, y, cost, speed, year);
        }
}

public class Task03 {

    public static void main(String[] args) {

        Plane plane = new Plane(468.7, 832.3, 3000000.50, 827.0, 2016, 11000.0, 120);
        Ship ship = new Ship(1240.8, 4027.2, 9000000.55, 47.8, 2012, 600, "Odesa");
        Car car = new Car(8.0, 30.0, 38000.2, 180.5, 2018);

        System.out.println("\nPlane information:");
        System.out.println("Coordinates: [" + plane.getX() + ", " + plane.getY() + "]");
        System.out.println("Cost: " + plane.getCost());
        System.out.println("Speed: " + plane.getSpeed());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Height: " + plane.getHeight());
        System.out.println("Passengers: " + plane.getPassengers());

        System.out.println("\nShip information:");
        System.out.println("Coordinates: [" + ship.getX() + ", " + ship.getY() + "]");
        System.out.println("Cost: " + ship.getCost());
        System.out.println("Speed: " + ship.getSpeed());
        System.out.println("Year: " + ship.getYear());
        System.out.println("Passengers: " + ship.getPassengers());
        System.out.println("Port of destination : " + ship.getPort());

        System.out.println("\nCar information:");
        System.out.println("Coordinates: [" + car.getX() + ", " + car.getY() + "]");
        System.out.println("Cost: " + car.getCost());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Year: " + car.getYear());

    }

}
