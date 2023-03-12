package homework020;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     11.03.2023 23:40
 * Description: override the toString method,
 */

@Getter
@Setter
@AllArgsConstructor //generates a constructor with all parameters
class Device1 {

    private String manufacturer;
    private float price;
    private String serialNumber;

    @Override
    public String toString() {
        return "Device: manufacturer = " + manufacturer + ", price = " + price +
                ", serialNumber = " + serialNumber;
    }
}

@Getter
@Setter
class Monitor1 extends Device1 {

    private int resolutionX;
    private int resolutionY;

    public Monitor1(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }

    @Override
    public String toString() {
        return super.toString() + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

    public void print() {
        System.out.println(this);
    }
}

@Getter
@Setter
class EthernetAdapter1 extends Device1 {

    private int speed;
    private String mac;

    public EthernetAdapter1(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;

    }

    @Override
    public String toString() {
        return super.toString() + ", speed = " + speed + ", mac = " + mac;
    }

    public void print() {
        System.out.println(this);
    }
}

public class Task03 {

    public static void main(String[] args) {

        Monitor1 monitor = new Monitor1("Samsung", 120, "AB1234567CD", 1280, 1024);
        monitor.print();
    }

}