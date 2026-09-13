package practice_8.library.exceptions;

//unchecked -> can extends Error, RuntimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}
