package homework015;

import java.util.ArrayList;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     06.03.2023 21:47
 * Description: Printer
 */

class Printer {

    public void print(String value) {
        System.out.println(value);
    }
}

class ColorPrinter extends Printer {

    private final String colorCode;

    public ColorPrinter(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public void print(String value) {
        System.out.print(colorCode);
        super.print(value);
        System.out.print("\u001B[0m");
    }

}

public class Task06 {

    public static void main(String[] args) {

        ArrayList<Printer> printers = new ArrayList<>();
        printers.add(new Printer());
        printers.add(new ColorPrinter("\u001B[31m")); // red
        printers.add(new ColorPrinter("\u001B[32m")); // green
		printers.add(new ColorPrinter("\u001B[33m")); // yellow
        printers.add(new ColorPrinter("\u001B[34m")); // blue
        printers.add(new ColorPrinter("\u001B[35m")); // purple
        printers.add(new ColorPrinter("\u001B[36m")); // cyan
        printers.add(new ColorPrinter("\u001B[37m")); // white
        printers.add(new Printer());

        for (int i = 0; i < printers.size(); i++) {
            Printer printer = printers.get(i);
            if (printer instanceof ColorPrinter) {
                ColorPrinter colorPrinter = (ColorPrinter) printer; // DownCast
                colorPrinter.print("This is a test Typecasting in color.");
            } else {
                printer.print("Instanceof operator returns false.");
            }
        }
    }

}
