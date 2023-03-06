package homework004;

import java.util.Scanner;

/**
 * FileName: Task08
 * Author:   Andriy Vulook
 * Date:     05.02.2023 0:46
 * Description: Translator
 */

public class Task08 {

    static final String word1u = "Понеділок";
    static final String word2u = "Вівторок";
    static final String word3u = "Середа";
    static final String word4u = "Четвер";
    static final String word5u = "П’ятниця";
    static final String word6u = "Субота";
    static final String word7u = "Неділя";

    static final String word1e = "Monday";
    static final String word2e = "Tuesday";
    static final String word3e = "Wednesday";
    static final String word4e = "Thursday";
    static final String word5e = "Friday";
    static final String word6e = "Saturday";
    static final String word7e = "Sunday";

    public static void main(String[] args) {

        System.out.println("Дні тижня/Days of the week: ");
        System.out.println("Enter the day of the week to translate: ");
        Scanner s = new Scanner(System.in);
        System.out.print("==> ");
        String day = s.next();
        System.out.print("==> ");
        System.out.println(translator(day));
    }

    public static String translator(String day) {
        if (day.equalsIgnoreCase(word1u)) return word1e;
        if (day.equalsIgnoreCase(word2u)) return word2e;
        if (day.equalsIgnoreCase(word3u)) return word3e;
        if (day.equalsIgnoreCase(word4u)) return word4e;
        if (day.equalsIgnoreCase(word5u)) return word5e;
        if (day.equalsIgnoreCase(word6u)) return word6e;
        if (day.equalsIgnoreCase(word7u)) return word7e;
        if (day.equalsIgnoreCase(word1e)) return word1u;
        if (day.equalsIgnoreCase(word2e)) return word2u;
        if (day.equalsIgnoreCase(word3e)) return word3u;
        if (day.equalsIgnoreCase(word4e)) return word4u;
        if (day.equalsIgnoreCase(word5e)) return word5u;
        if (day.equalsIgnoreCase(word6e)) return word6u;
        if (day.equalsIgnoreCase(word7e)) return word7u;
        else return "There is no such word in the dictionary!";
    }
}
