package homework004;

import java.time.Month;
import java.util.Scanner;

/**
 * FileName: Task07
 * Author:   Andriy Vulook
 * Date:     04.02.2023 22:58
 * Description: the number of days in month for a non-leap year.
 */

public class Task07 {

    public static void main(String[] args) {

        System.out.println("Count the number of days in a month.");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = s.nextInt();

        switch (month) {
            case 1:
                Month january = Month.JANUARY;
                System.out.println(january.length(false));
                break;
            case 2:
                Month february = Month.FEBRUARY;
                System.out.println(february.length(false));
                break;
            case 3:
                Month march = Month.MARCH;
                System.out.println(march.length(false));
                break;
            case 4:
                Month april = Month.APRIL;
                System.out.println(april.length(false));
                break;
            case 5:
                Month may = Month.MAY;
                System.out.println(may.length(false));
                break;
            case 6:
                Month june = Month.JUNE;
                System.out.println(june.length(false));
                break;
            case 7:
                Month July = Month.JULY;
                System.out.println(July.length(false));
                break;
            case 8:
                Month august = Month.AUGUST;
                System.out.println(august.length(false));
                break;
            case '9':
                Month september = Month.SEPTEMBER;
                System.out.println(september.length(false));
                break;
            case 10:
                Month october = Month.OCTOBER;
                System.out.println(october.length(false));
                break;
            case 11:
                Month november = Month.NOVEMBER;
                System.out.println(november.length(false));
                break;
            case 12:
                Month december = Month.DECEMBER;
                System.out.println(december.length(false));
                break;
            default:
                System.out.println("Oooops, something wrong !");
                return;
        }
    }

}
