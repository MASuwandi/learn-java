package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "John";
        first = first + " " + "Wick";

        System.out.println(first);

        String second = "John Wick";

        System.out.println(second);
        // false (wrong way) to compare object
        System.out.println(first == second);

        // true (right way)
        System.out.println(first.equals(second));

        // false (wrong way)
        // use current memory address because same data
        // refer to existing data
        String third = "John Wick";

        System.out.println(third == second);


    }
}
