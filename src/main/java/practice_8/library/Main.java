package practice_8.library;


import practice_8.library.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Book1", "Author1"));
        library.addBook(new Book("Book2", "Author2"));
        library.addBook(new Book("Book3", "Author3"));
//        library.addBook(new Book("Book3", "Author3"));


        try {
            library.findBook("666");
        } catch (BookNotFoundException e) {
            System.out.println("BookNotFoundException was caught");
        }

    }
}
