package main.classes;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {

        // String Class
        String name = "Rocket Racoon";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Roc"));
        System.out.println(name.endsWith("coon"));
        System.out.println(Arrays.toString(name.split(" ")));

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        System.out.println(chars);

    }

}
