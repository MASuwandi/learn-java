package main.classes;

public class NumberApp {
    public static void main(String[] args) {

        // Method di Number Class
        // Non-primitif
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // Konversi String ke Number
        String ex = "10000";

        // throw exception
        int resInt = Integer.valueOf(ex);
        int resInt2 = Integer.parseInt(ex);

        System.out.println(resInt);
        System.out.println(resInt2);

        String ex2 = "100.10";

        Double resDouble = Double.valueOf(ex2);

        System.out.println(resDouble);

    }
}
