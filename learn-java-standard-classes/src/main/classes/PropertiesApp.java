package main.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            // load / take data properties
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.port"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));
        }
        // FileNotFoundException for FileInputStream
        catch (FileNotFoundException exception) {
            System.out.println("File not found: " + exception.getMessage());
        }
        // IOException for .load
        catch (IOException exception) {
            System.out.println("Fail load data from file: " + exception.getMessage());
        }

        try {
            // Save properties
            Properties properties = new Properties();
            properties.put("name.first", "Bob");
            properties.put("name.last", "Wick");

            properties.store(new FileOutputStream("name.properties"), "Config Name");
        } catch (FileNotFoundException exception) {
            System.out.println("Fail create file properties: " + exception.getMessage());
        }
        catch (IOException exception) {
            System.out.println("Fail save properties: " + exception.getMessage());
        }

    }
}
