package main.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        // ori to base64
        String original = "Learn() how to program() with Java";

        // string to byte binary
        String encoded = Base64.getEncoder().encodeToString(original.getBytes(StandardCharsets.UTF_8));

        System.out.println(encoded);

        // base64 to ori
        // byte binary to string
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result);

    }
}
