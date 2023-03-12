package homework020;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     11.03.2023 22:29
 * Description: Create classes:
 * 1) Basic class Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Subclass Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed(int), mac(String));
 */


class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
}


class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }
}


class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;

    }
}

public class Task02 {
    
}