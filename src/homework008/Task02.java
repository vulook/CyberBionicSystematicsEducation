package homework008;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;
import java.util.Scanner;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     20.02.2023 5:11
 * Description: Bank
 */

class MyTableModel extends AbstractTableModel {

    String[] columnNames = {"Name", "Total-C", "Start-C", "Stop-C", "Mon", "Mon-P", "Paid-P", "Paid-F"};

    Object[][] data = {
            {"Jared", 12200.0, "11.2021", "11.2023", 25, 488.0, 7742.9, 8000.0},
            {"Ronald", 1100.50, "12.2022", "09.2023", 9, 111.5, 637.0, 400.5},
            {"Susan", 118800.0, "05.2020", "05.2024", 50, 2376.5, 81180.0, 81180.0},
    };

    public int getRowCount() {
        return data.length;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

}

public class Task02 {
    static int row;
    static MyTableModel tableModel = new MyTableModel();

    public static void main(String[] args) {

        String name;
        double payment;
        System.out.println("Ask for the full name of the bank client: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name (Jared or Ronald or Susan): ");
        name = s.next();
        System.out.println("Enter the Credit payment amount (Jared=488 or Ronald=111.5 or Susan=2376.5)");
        payment = Double.parseDouble(s.next());

        searchPerson(name, payment);

    }

    static void searchPerson(String name, double payment) {
        boolean flag = false;
        int row_length = tableModel.getRowCount();
        int col_length = tableModel.getColumnCount();

        for (int i = 0; i < row_length; i++) {
            for (int j = 0; j < col_length; j++) {
                if ((tableModel.getValueAt(i, j)).toString().equalsIgnoreCase(name)) {
                    row = i;
                    flag = true;
                    System.out.println("The client " + name + " is found in line " + (row + 1));
                    System.out.println("----------------------------------------------------------------------------------");
                }
            }
        }

        if (flag) {
            System.out.println(Arrays.toString(tableModel.columnNames)
                    .replace("],", "\n")
                    .replace(",", "\t| ")
                    .replaceAll("[\\[\\]]", " "));

            int i = row;
            System.out.println(Arrays.toString((tableModel.data[i]))
                    .replace("],", "\n")
                    .replace(",", "\t| ")
                    .replaceAll("[\\[\\]]", " "));
            System.out.println("----------------------------------------------------------------------------------");

            checkCredit(payment);

        } else {
            System.out.println("This person is not in the bank's database");
        }
    }

    static void checkCredit(double payment) {
        int i = row;
        double total_C = (double) tableModel.getValueAt(i, 1);   //загальна сума кредиту (з %)
        double mon_P = (double) tableModel.getValueAt(i, 5);     //обов'язковий щомісячний платіж
        double paid_P = (double) tableModel.getValueAt(i, 6);    //очікувана сплата по кредиту
        double paid_F = (double) tableModel.getValueAt(i, 7);    //фактична сплата по кредиту

        if (total_C > paid_F)
            System.out.println("Credit status - ACTIVE!");
        else
            System.out.println("Credit status - PASSIVE!");

        System.out.println("\nExpected payment amount: ");
        System.out.println("Monthly PAYMENT: " + mon_P);
        if (paid_P > paid_F) {
            System.out.println("Available DEBT: " + (paid_P - paid_F));
            System.out.println("Mandatory payment: " + (mon_P + (paid_P - paid_F)));
            System.out.println("Payment made: " + payment);
            System.out.println("Difference: " + (payment - (mon_P + (paid_P - paid_F))));
        } else if (paid_P < paid_F) {
            System.out.println("Available OVERPAYMENT: " + (paid_F - paid_P));
            System.out.println("Mandatory payment: " + (mon_P - (paid_F - paid_P)));
            System.out.println("Payment made: " + payment);
            System.out.println("Difference: " + (payment - (mon_P - (paid_F - paid_P))));
        } else {
            System.out.println("Has no debt: DEBT = 0");
            System.out.println("Mandatory payment: " + mon_P);
            System.out.println("Payment made: " + payment);
            System.out.println("Difference: " + (payment - mon_P));
        }
    }

}
