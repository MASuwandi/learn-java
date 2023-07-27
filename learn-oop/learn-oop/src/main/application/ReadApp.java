package main.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        // Code: Manual Close Resource
//        BufferedReader reader = null;
//
//        try {
//            // read file
//            // root
//            reader = new BufferedReader(
//                    // succes case
//                    new FileReader("README-PZN.md")
//                    // fail case
////                    new FileReader("bob.md")
//            );
//
//            // read through the text line
//            while (true) {
//                String line = reader.readLine();
//                if (line == null) break;
//
//                System.out.println("line: " + line);
//            }
//        } catch (Throwable throwable) {
//            System.out.println("Error membaca file " + throwable.getMessage());
//        } finally {
//            // check if reader generate before
//            if (reader != null) {
//                try {
//                    // close() can throws IOException
//                    reader.close();
//                    System.out.println("Success Close Reader!");
//                } catch (IOException exception) {
//                    System.out.println("Error menutup resource " + exception.getMessage());
//                }
//            }
//        }

        // Try with Resource (AutoCloseable)
        try (BufferedReader reader = new BufferedReader(new FileReader("README-PZN.md"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) break;

                System.out.println("line: " + line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }

    }
}
