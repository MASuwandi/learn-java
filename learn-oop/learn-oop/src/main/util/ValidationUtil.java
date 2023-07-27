package main.util;

import main.annotation.NotBlank;
import main.data.LoginRequest;
import main.error.BlankException;
import main.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    // "throws ValidationException" bisa mengembalikan validation exception.
    // throws NullPointerException not required for throw type

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        }
        else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        }
        else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        }
        else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    // throws RuntimeException not required for throw type
    public static void validateRuntime(LoginRequest loginRequest) {
        // why not error
        // NullPointerException extends RuntimeException
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        }
        else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        }
        else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        }
        else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password tidak boleh kosong");
        }
    }

    // Reflection
    public static void validateReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            // field could be private so we need to
            // force to access field
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                // Validate, can return exception need try catch
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Cant't access field: " + field.getName());
                }
            }
        }
    }

}
