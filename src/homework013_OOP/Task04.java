package homework013_OOP;

import lombok.*;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     07.03.2023 23:27
 * Description: Computer
 */

@Getter
@AllArgsConstructor //generates a constructor with all parameters
@ToString
class Computer {
    private String brand;
    private String CPU;
    private int memorySize;
}

public class Task04 {

    public static void main(String[] args) {

        Computer[] computers = new Computer[10];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(getBrand(), getCPU(), getMemorySize());
        }

        for (Computer computer : computers) {
            System.out.println("Computer: "
                    + computer.getBrand() + ", "
                    + computer.getCPU() + ", "
                    + computer.getMemorySize() + "GB");
        }

    }

    static String getBrand() {
        String[] brands = new String[]{"Lenovo", "HP", "Dell", "Acer", "MSI"};
        int n = (int) Math.floor(Math.random() * brands.length);
        return brands[n];
    }

    static String getCPU() {
        String[] cpu = new String[]{"Intel Celeron G6900", "Intel Core i5", "Ryzen 9", "Intel XEON 10"};
        int n = (int) Math.floor(Math.random() * cpu.length);
        return cpu[n];
    }

    static int getMemorySize() {
        int[] ms = new int[]{4, 8, 16, 32, 64};
        int n = (int) Math.floor(Math.random() * ms.length);
        return ms[n];
    }

}
