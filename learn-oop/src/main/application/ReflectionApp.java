package main.application;

import main.util.ValidationUtil;
import main.data.CreateUserRequest;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        // case 1
        // not set value
        // case 2
        // set value
        request.setUsername("admin");
        request.setPassword("adminpass");

        ValidationUtil.validateReflection(request);
    }
}
