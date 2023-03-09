package homework018;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     09.03.2023 1:04
 * Description: (enum) Vehicles
 *
 * Implementing toString() on enums in Java
 * https://www.baeldung.com/java-enums-tostring
 *
 */

enum Vehicles {
    SEDAN(15000), HATCHBACK(25000), COUPE(18000), SUV(40000), PICKUP(10000);

    private final int price;

    private Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        switch (this) {
            case SEDAN:
                return "Yellow";
            case HATCHBACK:
                return "Green";
            case COUPE:
                return "Purple";
            case SUV:
                return "Black";
            case PICKUP:
                return "Brown";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return String.format("Vehicle %d - Model: %s, Price: %d, Color: %s",
                ordinal() + 1, name(), price, getColor());
    }

}

public class Task04 {

    public static void main(String[] args) {

        for (Vehicles vehicle : Vehicles.values()) {
            System.out.println(vehicle);
        }
    }

}

