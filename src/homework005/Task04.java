package homework005;

import java.util.Scanner;

/**
 * FileName: Task04
 * Author:   Andriy Vulook
 * Date:     13.02.2023 1:05
 * Description: Calculate Salary of an Employee with BONUS
 */

public class Task04 {
    static final double BONUS_1 = 0.10;
    static final double BONUS_2 = 0.15;
    static final double BONUS_3 = 0.25;
    static final double BONUS_4 = 0.35;
    static final double BONUS_5 = 0.45;
    static final double BONUS_6 = 0.50;

    public static void main(String[] args) {

        int serviceYears;
        double salary;

        System.out.println("Salary of an Employee with BONUS ... ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the service years: ");
        serviceYears = s.nextInt();
        System.out.println("Enter the basic salary: ");
        salary = Double.parseDouble(s.next());

        System.out.println("\nService years: " + serviceYears + ", Basic salary: " + salary);
        System.out.println(calculate(serviceYears, salary));

    }

    static double calculate(int serviceYears,  double salary) {
        double totalSalary = 0;
        if (serviceYears < 5) {
            System.out.println("Bonus amount = " + BONUS_1 * 100 + "%");
            totalSalary = salary + salary * BONUS_1;
        } else if (serviceYears >= 5 && serviceYears < 10) {
            System.out.println("Bonus amount = " + BONUS_2 * 100 + "%");
            totalSalary = salary + salary * BONUS_2;
        } else if (serviceYears >= 10 && serviceYears < 15) {
            System.out.println("Bonus amount = " + BONUS_3 * 100 + "%");
            totalSalary = salary + salary * BONUS_3;
        } else if (serviceYears >= 15 && serviceYears < 20) {
            System.out.println("Bonus amount = " + BONUS_4 * 100 + "%");
            totalSalary = salary + salary * BONUS_4;
        } else if (serviceYears >= 20 && serviceYears < 25) {
            System.out.println("Bonus amount = " + BONUS_5 * 100 + "%");
            totalSalary = salary + salary * BONUS_5;
        } else if (serviceYears >= 25) {
            System.out.println("Bonus amount = " + BONUS_6 * 100 + "%");
            totalSalary = salary + salary * BONUS_6;
        } else {
            System.out.println("Error!");
        }
        System.out.print("Total salary: ");
        return totalSalary;
    }

}
