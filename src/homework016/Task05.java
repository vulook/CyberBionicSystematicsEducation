package homework016;

import java.util.Scanner;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     02.03.2023 17:56
 * Description:  ConverterTemperature
 */

abstract class Temperature {

    public abstract Celsius convertToCelsius();

    public abstract Kelvin convertToKelvin();

    public abstract Fahrenheit convertToFahrenheit();
}

class Celsius extends Temperature {

    double celsius;

    Celsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public Celsius convertToCelsius() {
        return this;
    }

    @Override
    public Kelvin convertToKelvin() {
        return new Kelvin(celsius + 273.15);
    }

    @Override
    public Fahrenheit convertToFahrenheit() {
        return new Fahrenheit((celsius * 9 / 5) + 32);
    }

    @Override
    public String toString() {
        return String.format("\u2103 = %.1f.", celsius);
    }
}

class Kelvin extends Temperature {

    double kelvin;

    Kelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    @Override
    public Celsius convertToCelsius() {
        return new Celsius(kelvin - 273.15);
    }

    @Override
    public Kelvin convertToKelvin() {
        return this;
    }

    @Override
    public Fahrenheit convertToFahrenheit() {
        return new Fahrenheit((kelvin - 273.15) * 9 / 5 + 32);
    }

    @Override
    public String toString() {
        return String.format("\u212A = %.1f.", kelvin);
    }
}

class Fahrenheit extends Temperature {
    double fahrenheit;

    Fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public Celsius convertToCelsius() {
        return new Celsius((fahrenheit - 32) / 1.8);
    }

    @Override
    public Kelvin convertToKelvin() {
        return new Kelvin((fahrenheit - 32) * 5 / 9 + 273.15);
    }

    @Override
    public Fahrenheit convertToFahrenheit() {
        return this;
    }

    @Override
    public String toString() {
        return String.format("\u2109 = %.1f.", fahrenheit);
    }

}

public class Task05 {

    public static void main(String[] args) {

        int scales;
        double temperature;

        System.out.println("Temperature Conversion Calculator starting ...");
        Scanner s = new Scanner(System.in);
        System.out.println("Select your Current Temperature: ");
        temperature = Double.parseDouble(s.next());
        System.out.println("Select your Temperature Scales: ");
        System.out.println("Choose from: | ℃ = 1 | K = 2 | ℉ = 3 |");
        scales = s.nextInt();

        switch (scales) {
            case 1:
                Celsius celsius = new Celsius(temperature);
                System.out.println(celsius.convertToCelsius());
                System.out.println(celsius.convertToKelvin());
                System.out.println(celsius.convertToFahrenheit());
                break;
            case 2:
                Kelvin kelvin = new Kelvin(temperature);
                System.out.println(kelvin.convertToKelvin());
                System.out.println("Conversion Formula: °C = K − 273.15. " + kelvin.convertToCelsius());
                System.out.println("Conversion Formula: °F = K × 9/5 − 459.67. " + kelvin.convertToFahrenheit());
                break;
            case 3:
                Fahrenheit fahrenheit = new Fahrenheit(temperature);
                System.out.println(fahrenheit.convertToFahrenheit());
                System.out.println("Conversion Formula: °C = (°F − 32) × 5/9. " + fahrenheit.convertToCelsius());
                System.out.println("Conversion Formula: K = (°F + 459.67) × 5/9. " + fahrenheit.convertToKelvin());
                break;
            default:
                System.out.println("The format is not supported.");
        }
    }

}
