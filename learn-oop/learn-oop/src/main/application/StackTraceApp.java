package main.application;

public class StackTraceApp {
    public static void main(String[] args) {

        // case 1
//        try {
//            String[] names = {
//                    "Thor", "Groot", "Rabbit", "Racoon"
//            };
//
//            System.out.println(names[100]);
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }

        // case 2
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    // Multiple StackTraceElement
    public static void sampleError() {
        try {
            String[] names = {
                    "Thor", "Groot", "Rabbit", "Racoon"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
