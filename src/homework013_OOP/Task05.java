package homework013_OOP;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     08.03.2023 0:40
 * Description: Address
 */

class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public String getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Index: " + getIndex()
                + ", Country: " + getCountry()
                + ", City: " + getCity()
                + ", Street: " + getStreet()
                + ", House: " + getHouse()
                + ", Apartment: " + getApartment();
    }

    public void print() {
        System.out.println(this);
    }
}

public class Task05 {

    public static void main(String[] args) {

        Address address = new Address();

        address.setIndex("01008");
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Hrushevsky Street");
        address.setHouse("5");
        address.setApartment("42");

        System.out.println("Index: " + address.getIndex());
        System.out.println("Country: " + address.getCountry());
        System.out.println("City: " + address.getCity());
        System.out.println("Street: " + address.getStreet());
        System.out.println("House: " + address.getHouse());
        System.out.println("Apartment: " + address.getApartment());

    }

}


