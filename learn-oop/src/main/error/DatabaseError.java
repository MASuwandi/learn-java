package main.error;

// extends exception type
public class DatabaseError extends Error {

    public DatabaseError(String message) {
        super(message);
    }
}
