package main.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Rocket");
        joiner.add("Baby");
        joiner.add("Racoon");

        String value = joiner.toString();
        System.out.println(value);
    }
}
