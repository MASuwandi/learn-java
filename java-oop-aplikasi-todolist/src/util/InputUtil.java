package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
        System.out.print(info + " : ");
        // waiting for input from terminal
        // when enter click, method give return to invoker.
        return scanner.nextLine();
    }
}
