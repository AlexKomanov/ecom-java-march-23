package lesson_06.classes.car;

public class MyBooks {
    public static void main(String[] args) {

        Book.printCounter();

        Book myBook = new Book();

        Book.printCounter();
//
        Book newBook = new Book("Harry potter", 2015, "J. Rolling");

        Book.printCounter();

        System.out.println(newBook.getInfo());









    }
}
