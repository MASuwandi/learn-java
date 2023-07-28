package main.application;

import main.data.LoginRequest;
import main.error.ValidationException;
import main.util.ValidationUtil;

public class ValidationApp {
    public static <err extends Throwable> void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("", null);

        // Multiple Try Catch
        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Exec Finally, ex: Closing Connection!");
        }

        // or

        // catch (ValidationException exception) {
        // System.out.println("Data tidak valid: " + exception.getMessage());
        // } catch (NullPointerException exception) {
        // System.out.println("Data null: " + exception.getMessage());
        // }

        // Runtime Exception
        LoginRequest loginRequest2 = new LoginRequest(null, null);

        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("App Still Running!");
    }
}
