package lesson_06.classes.car;

public class Book {

    private String name;
    private int year;

    private String author;

    public static int bookCounter = 0;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
        bookCounter++;
    }

    public Book(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
        bookCounter++;
    }

    public Book() {
        bookCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getInfo() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    public static void printCounter() {
        System.out.println(bookCounter);

    }


}
