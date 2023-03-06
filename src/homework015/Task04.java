package homework015;

import java.util.Scanner;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     06.03.2023 12:12
 * Description: Task04
 */

class DocumentWorker {

    public void openDocument() {
        System.out.println("The document opened.");
    }

    public void editDocument() {
        System.out.println("Document edits are available in the PRO-version.");
    }

    public void saveDocument() {
        System.out.println("Document saves are available in the PRO-version.");
    }
}

class ProDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("The document was edited.");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document was saved in a OLD format.");
        System.out.println("Other save formats are available in the EXPERT-version.");
    }
}

class ExpertDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("The document was edited.");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document was saved in a NEW format.");
    }
}

public class Task04 {

    public static void main(String[] args) {

        String key;
        DocumentWorker dw;

        System.out.println("This program edits and saves documents...");
        System.out.println("Enter the KEY to unlock more functionality: PRO | EXP");
        System.out.println("By default, the key is FREE.");
        System.out.print("==>");

        Scanner scanner = new Scanner(System.in);
        key = scanner.nextLine();

        switch (key) {
            case "PRO":
                dw = new ProDocumentWorker();
                break;
            case "EXP":
                dw = new ExpertDocumentWorker();
                break;
            default:
                dw = new DocumentWorker();
        }

        dw.openDocument();
        dw.editDocument();
        dw.saveDocument();
    }

}
