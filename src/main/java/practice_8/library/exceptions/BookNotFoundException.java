package practice_8.library.exceptions;

//checked -> extends Exception ot it's inheritors
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
