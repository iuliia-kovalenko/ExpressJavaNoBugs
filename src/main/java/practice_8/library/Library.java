package practice_8.library;

import practice_8.library.exceptions.BookNotFoundException;
import practice_8.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // add book
    // exception-> if we add existing book -> unchecked exception InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("This book exists in the library");
        } else {
            books.add(book);
        }
    }

    //search cook -> if we can not find book -> checked exception -> BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException{
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book was not found in the library by name: " + name);
    }
}
