package homework020;

import lombok.*;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     11.03.2023 22:29
 * Description: Create classes:
 * 1) Basic class Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Subclass Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed(int), mac(String));
 */

@Getter
@Setter
@AllArgsConstructor //generates a constructor with all parameters
@ToString
class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

}

@Getter
@Setter
class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }
}

@Getter
@Setter
class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;

    }
}

public class Task02 {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("Dell", 320, "123456789", 1920, 1080);
        EthernetAdapter adapter = new EthernetAdapter("Starlink", 2000, "8888888888", 1000, "ce:5f:65:b0:a9:35");

        System.out.println(monitor.getManufacturer() + ", resolution:" + monitor.getResolutionX() + "x" + monitor.getResolutionY());
        monitor.setResolutionX(2560);
        monitor.setResolutionY(1440);
        System.out.println(monitor.getManufacturer() + ", resolution:" + monitor.getResolutionX() + "x" + monitor.getResolutionY());

        System.out.println(adapter.getManufacturer() + ", speed:" + adapter.getSpeed());
        adapter.setManufacturer("Starlink by SpaceX");
        adapter.setSpeed(3000);
        System.out.println(adapter.getManufacturer() + ", speed:" + adapter.getSpeed());

    }

}
