package main.application;

import main.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("root", "rootpass");

        // auto generate toString
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        // constructor overloading
        System.out.println(new LoginRequest("Bob"));
        System.out.println(new LoginRequest("Bob", "bub"));
        System.out.println(new LoginRequest());

    }
}
