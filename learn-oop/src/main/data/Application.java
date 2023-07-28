package main.data;

public class Application {

    public static final int PROCESSORS;

    // Static Block
    // Run first
    static {
        System.out.println("Accessing class Application!");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
