package homework013_OOP;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     07.03.2023 18:24
 * Description: Book (Main) and show()
 */

class Book {

    private Title title;
    private Author author;
    private Content content;


    public Title getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Content getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = new Title(title);
    }

    public void setAuthor(String author) {
        this.author = new Author(author);
    }

    public void setContent(String content) {
        this.content = new Content(content);
    }

    public Book() {}

    public void show() {
        this.title.show();
        this.author.show();
        this.content.show();
    }

    static class Title {

        private final String title;

        Title(String title) {
            this.title = title;
        }

        public void show() {
            String bold = "\033[1mTitle\033[0m:";
            System.out.println(bold);
            System.out.println(title);
        }
    }

    static class Author {

        private final String author;

        Author(String author) {
            this.author = author;
        }

        public void show() {
            String bold = "\033[1mAuthor\033[0m:";
            System.out.println(bold);
            System.out.println(author);
        }
    }

    static class Content {

        private final String content;

        Content(String content) {
            this.content = content;
        }

        public void show() {
            String bold = "\033[1mTable of Contents\033[0m:";
            System.out.println(bold);
            System.out.println(content);
        }
    }
}

public class Task03 {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Java 17 for Absolute Beginners. Learn the Fundamentals of Java Programming, Second Edition");
        book.setAuthor("Iuliana Cosmina, Edinburgh, UK, 2022");
        book.setContent("Chapter 1: An Introduction to Java and Its History \n"
                + "Chapter 2: Preparing Your Development Environment \n"
                + "Chapter 3: Getting Your Feet Wet \n"
                + "Chapter 4: Java Syntax \n"
                + "Chapter 5: Data Types \n"
                + "Chapter 6: Operators \n"
                + "Chapter 7: Controlling the Flow \n"
                + "Chapter 8: The Stream API \n"
                + "Chapter 9: Debugging, Testing, and Documenting \n"
                + "Chapter 10: Making Your Application Interactive \n"
                + "Chapter 11: Working With Files \n"
                + "Chapter 12: The Publish-Subscribe Framework \n"
                + "Chapter 13: Garbage Collection \n");
        book.show();
    }

}
