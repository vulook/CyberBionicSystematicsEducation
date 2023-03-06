package homework016;

import java.util.Scanner;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     04.03.2023 9:26
 * Description: Convert Temp (second option)
 *
 * =================================================================
 * The ratio of Celsius to Fahrenheit can be written as 180/100, reducing it to 9/5
 * double ratio = 1; //default
 *
 * According to the Kelvin scale, water freezes at 273.15 K
 * double freeze;
 * =================================================================
 */

abstract class TempTo {

    public abstract double toKelvin(double t);

    public abstract double toFahrenheit(double t);
}

interface Converter {

    double ratio();

    double freeze();

    double convert(double t);
}

class Cels extends TempTo implements Converter {

    double ratio, freeze;

    @Override
    public double ratio() {
        return ratio;
    }


    @Override
    public double freeze() {
        return freeze;
    }

    public Cels(double ratio, double freeze) {
        this.ratio = ratio;
        this.freeze = freeze;
    }

    public Cels(double freeze) {
        this.freeze = freeze;
    }

    @Override
    public double toKelvin(double t) {
        return convert(t);
    }

    @Override
    public double toFahrenheit(double t) {
        return convert(t);
    }

    @Override
    public double convert(double t) {
        return t * ratio + freeze;
    }

}

public class Task06 {

    public static void main(String[] args) {

        double temp;
        double kelvin;
        double fahrenheit;

        System.out.println("Temperature Conversion Calculator starting ...");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Current Temperature ºC: ");
        temp = Double.parseDouble(s.next());

        System.out.println("Celsius: " + String.format("\u2103 = %.1f.", temp));

        // Celsius to Kelvin: K = ºC + 273.15 K
        Cels celsius1 = new Cels(273.15);
        kelvin = celsius1.toKelvin(temp);
        System.out.println("Kelvin: " + String.format("\u212A = %.1f.", kelvin));

        //Celsius to Fahrenheit: ºF = ºC * 9/5 + 32
        Cels celsius2 = new Cels(9. / 5, 32);
        fahrenheit = celsius2.toFahrenheit(temp);
        System.out.println("Fahrenheit: " + String.format("\u2109 = %.1f.", fahrenheit));
    }

}
