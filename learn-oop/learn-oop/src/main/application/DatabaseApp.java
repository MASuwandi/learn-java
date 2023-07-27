package main.application;

import main.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

        // scenario1
        connectDatabase("Admin", "secret");
        // scenario2
        connectDatabase("Admin", "secret");

        System.out.println("Success connect to Database!");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null)
            throw new DatabaseError("Can't connect to Database!");
    }

}
