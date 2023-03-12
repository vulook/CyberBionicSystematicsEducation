package homework020;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     12.03.2023 0:10
 * Description: Override equals & hashCode methods in each class
 */

@Data
@AllArgsConstructor //generates a constructor with all parameters
class Device2 {

    private String manufacturer;
    private float price;
    private String serialNumber;

    @Override
    public String toString() {
        return "Device: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }
}

@Getter
@Setter
class Monitor2 extends Device2 {

    private int resolutionX;
    private int resolutionY;

    public Monitor2(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }

    @Override
    public String toString() {
        return super.toString() + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor2)) return false;
        if (!super.equals(o)) return false;
        Monitor2 monitor2 = (Monitor2) o;
        return getResolutionX() == monitor2.getResolutionX() && getResolutionY() == monitor2.getResolutionY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResolutionX(), getResolutionY());
    }

    public void print() {
        System.out.println(this);
    }
}

@Getter
@Setter
class EthernetAdapter2 extends Device2 {

    private int speed;
    private String mac;

    public EthernetAdapter2(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;

    }

    @Override
    public String toString() {
        return super.toString() + ", speed = " + speed + ", mac = " + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter2)) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter2 adapter2 = (EthernetAdapter2) o;
        return getSpeed() == adapter2.getSpeed() && getMac().equals(adapter2.getMac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }

    public void print() {
        System.out.println(this);
    }
}

public class Task04 {

    public static void main(String[] args) {

        Monitor2 monitor = new Monitor2("Samsung", 120, "AB1234567CD", 1280, 1024);
        monitor.print();
        monitor.setManufacturer("Dell");
        monitor.setResolutionX(2560);
        monitor.setResolutionY(1440);
        monitor.print();

        EthernetAdapter2 adapter = new EthernetAdapter2("Starlink", 2000, "SS-BK8888-123HR", 1000, "ce:5f:65:b0:a9:35");
        adapter.print();
        adapter.setManufacturer("Starlink by SpaceX");
        adapter.setSpeed(3000);
        adapter.print();

    }

}
