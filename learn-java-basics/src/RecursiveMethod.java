public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        // Finish the last number first
        loop(10);
        // 12k overflow
    }

    // Factorial Loop
    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    // Factorial Recursive
    static int factorialRecursive(int value) {
        if (value == 1) return 1;

        return value * factorialRecursive(value - 1);
    }

    // Error StackOverflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop: " + value);
            loop(value - 1);
        }
    }
}
