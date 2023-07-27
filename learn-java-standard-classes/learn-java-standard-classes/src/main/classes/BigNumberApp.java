package main.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        // ex Long number too large
        // Long value = 10_000_000_000_000_000_000L;

        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c);

    }
}
