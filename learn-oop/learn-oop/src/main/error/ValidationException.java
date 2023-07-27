package main.error;

// extends exception type
public class ValidationException extends Throwable {

    public ValidationException(String message) {
        super(message);
    }
}
