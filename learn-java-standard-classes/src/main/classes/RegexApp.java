package main.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {

        String string = "Rocket Baby Racoon Learn Java Standard Classes";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
