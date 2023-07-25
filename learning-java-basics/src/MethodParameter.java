public class MethodParameter {
    public static void main(String[] args) {

        sayHello();
        sayHello("John", "Wick");

        var result = sum(100, 100);
        System.out.println("result: " + result);

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(100, "-", 10));
        System.out.println(hitung(100, "cook", 100));

        int[] nilai = {80, 80, 80};
        sayCongratsOld("John", nilai);

        sayCongrats("Wick", 50,50,50);

    }

    // Method

    // Method Overloading
    static void sayHello() {
        System.out.println("Hello Bob Doe!");
    }

    // Method Parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static void sayHello(int id, String name) {
        System.out.println("Hello, Id: " + id + ", name: " + name);
    }

    // Method Return
    static int sum(int val1, int val2) {
        var total = val1 + val2;
        return total;
    }

    static int hitung(int val1, String operasi, int val2) {
        switch (operasi) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            default:
                return 0;
        }
    }

    // Method Variable Argument
    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) System.out.println("Selamat " + name + ", Anda Lulus!");
        else System.out.println("Maaf " + name + ", Anda Kurang Beruntung!");
    }

    // Tanpa Variable Argument
    static void sayCongratsOld(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) System.out.println("Selamat " + name + ", Anda Lulus!");
        else System.out.println("Maaf " + name + ", Anda Kurang Beruntung!");
    }
}
