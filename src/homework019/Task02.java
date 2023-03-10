package homework019;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     09.03.2023 14:31
 * Description: Describe a class called Worker
 */
@Getter
@ToString
class Worker {

    private final String name;
    private final String position;
    private final int year;
    private int experience;


    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public int getExperience() {
        LocalDate now = LocalDate.now();
        int currentYear = now.getYear();
        this.experience = currentYear - year;
        if (experience < 0) {
            throw new IllegalArgumentException("Incorrect experience");
        }
        return experience;
    }

}

class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker a, Worker b) {
        return a.getName().compareTo(b.getName());
    }
}

public class Task02 {

    public static void main(String[] args) {

        String name;
        String position;
        int year;
        int inputExperience;
        List<Worker> workers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the details for Worker no." + (i + 1) + ":");
            System.out.println("Surname and initials: ");
            name = s.nextLine();
            System.out.println("Position (worker, leader, loader): ");
            position = s.nextLine();
            System.out.println("Year of employment: ");
            year = checkValidYear(s);
            workers.add(new Worker(name, position, year));
        }

        workers.sort(new WorkerComparator());
        printList(workers);

        System.out.println("Work experience of workers.  Enter value: ___ year(s): ");
        int maxExperience = getMaxExperience(workers);
        System.out.println("Maximum experience in the system: " + maxExperience + ". You can't put more!");
        inputExperience = checkValidInputExp(s, maxExperience);
        printGetExpWorker(workers, inputExperience);

    }

    static void printList(List<Worker> workers) {
        System.out.println("\n");
        for (Worker worker : workers) {
            System.out.println((workers.indexOf(worker) + 1) + ". "
                    + worker.getName() + ", "
                    + worker.getPosition() + ", "
                    + worker.getYear() + ", "
                    + worker.getExperience());
        }
        System.out.println("\n");
    }

    static int checkValidYear(Scanner s) {
        int correctYear = 0;
        int currentYear = LocalDate.now().getYear();
        String year = s.nextLine();

        while (true) {
            try {
                correctYear = Integer.parseInt(year);

                if (correctYear < 1990 || correctYear > currentYear) {
                    throw new IllegalArgumentException();
                }

                break;
            } catch (NumberFormatException nfe) {
                System.out.println("This is not an integer. Try again!");
                System.out.print("==> ");
                year = s.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("The year must be between 1990 and the current year. Try again!");
                System.out.print("==> ");
                year = s.nextLine();
            }
        }
        return correctYear;
    }

    static int getMaxExperience(List<Worker> workers) {
        int maxExperience = 0;
        for (Worker worker : workers) {
            int experience = worker.getExperience();
            if (experience > maxExperience) {
                maxExperience = experience;
            }
        }
        return maxExperience;
    }

    static int checkValidInputExp(Scanner s, int maxExperience) {
        int correctExperience;
        String experience = s.nextLine();

        while (true) {
            try {
                correctExperience = Integer.parseInt(experience);

                if (correctExperience < 0 || correctExperience > maxExperience) {
                    throw new IllegalArgumentException();
                }

                break;
            } catch (NumberFormatException nfe) {
                System.out.println("This is not an integer. Try again!");
                System.out.print("==> ");
                experience = s.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("The experience must be between 0 and " + maxExperience + ". Try again!");
                System.out.print("==> ");
                experience = s.nextLine();
            }
        }
        return correctExperience;
    }

    static void printGetExpWorker(List<Worker> workers, int inputExperience) {
        int currentExperience;
        for (Worker worker : workers) {
            currentExperience = worker.getExperience();
            if (currentExperience > inputExperience) {
                System.out.println((workers.indexOf(worker) + 1) + ". "
                        + worker.getName() + ", "
                        + worker.getPosition() + ", "
                        + worker.getYear() + ", "
                        + worker.getExperience());
            }
            System.out.println("\n");
        }
    }

}
