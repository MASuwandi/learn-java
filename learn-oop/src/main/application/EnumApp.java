package main.application;

import main.data.Customer;
import main.data.Level;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {

        // Enum
        Customer customer = new Customer();
        customer.setName("Bob");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        // toString include
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelString = Level.VIP.name();

        Level level = Level.valueOf("PREMIUM");

        Level[] values = Level.values();

        System.out.println(levelString);
        System.out.println(level);
        // print with loop or Arrays.toString
        System.out.println(Arrays.toString(values));
    }
}
