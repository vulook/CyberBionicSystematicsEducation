package homework016;

import java.io.File;
import java.io.IOException;
import java.nio.file.NotDirectoryException;
import java.util.Objects;

/**
 * FileName: Task02
 * Author:   Andriy Vulook
 * Date:     01.03.2023 11:55
 * Description:  AbstractHandler
 */

abstract class AbstractHandler {
    public abstract void open();

    public abstract void create();

    public abstract void change();

    public abstract void save();
}

abstract class BaseFileHandler extends AbstractHandler {
    private final String fileName;

    public BaseFileHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {
        System.out.printf("Open %s file.\n", fileName);
    }

    @Override
    public void create() {
        System.out.printf("Create %s file.\n", fileName);
    }

    @Override
    public void change() {
        System.out.printf("Change %s file.\n", fileName);
    }

    @Override
    public void save() {
        System.out.printf("Save %s file.\n", fileName);
    }
}

class XMLHandler extends BaseFileHandler {

    public XMLHandler(String fileName) {
        super(fileName);
    }
}

class TXTHandler extends BaseFileHandler {

    public TXTHandler(String fileName) {
        super(fileName);
    }
}

class DOCHandler extends BaseFileHandler {

    public DOCHandler(String fileName) {
        super(fileName);
    }
}

public class Task02 {

    public static void main(String[] args) throws IOException {
        int numberFiles;
        int countXML = 0;
        int countTXT = 0;
        int countDOC = 0;
        int countUNSUPP = 0;
        int countWithoutEx = 0;

        String folderName = "Source";
        String extension;
        AbstractHandler handler;

        String path = checkFolder(folderName);
        File dir = new File(path);
        File[] listFiles = Objects.requireNonNull(dir.listFiles());
        numberFiles = listFiles.length;

        if (numberFiles == 0) {
            System.out.println("The folder is empty or does not exist.");
            return;
        }

        System.out.println("Files found in folder. Start processing ....");

        for (File file : listFiles) {
            String fileName = file.toString();
            int index = fileName.lastIndexOf('.');

            if (index < 0) {
                System.out.println(fileName + " => " + " file without extension");
                countWithoutEx++;
                continue;
            }

            extension = fileName.substring(index + 1);
            System.out.println(fileName + " => " + extension);

            switch (extension.toLowerCase()) {
                case "xml":
                    handler = new XMLHandler(fileName);
                    countXML++;
                    break;
                case "txt":
                    handler = new TXTHandler(fileName);
                    countTXT++;
                    break;
                case "doc":
                    handler = new DOCHandler(fileName);
                    countDOC++;
                    break;
                default:
                    System.out.println("The format is not supported.");
                    countUNSUPP++;
                    continue;
            }
            handler.open();
            handler.create();
            handler.change();
            handler.save();
        }

        System.out.println("----------RESULT----------");
        System.out.println("| Processed files: " + numberFiles + "    |");
        System.out.println("| XML: " + countXML + "                 |");
        System.out.println("| TXT: " + countTXT + "                 |");
        System.out.println("| DOC: " + countDOC + "                 |");
        System.out.println("| Unsupported: " + (countUNSUPP + countWithoutEx) + "         |");

    }

    static String checkFolder(String folderName) throws NotDirectoryException {
        String path;
        File file = new File(folderName);

        if (file.exists() && file.isDirectory()) {
            System.out.println("Folder " + folderName + " exists.");
            File absolutePath = new File(System.getProperty("user.dir"), folderName);
            path = absolutePath.getPath();
        } else {
            System.out.println("Folder " + folderName + " not found.");
            throw new NotDirectoryException(folderName);
        }

        return path;
    }

}

