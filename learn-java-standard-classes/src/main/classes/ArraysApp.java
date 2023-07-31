import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                1, 3, 9, 7, 5
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 11));

        int [] result = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(numbers, 2, 4);
        System.out.println(Arrays.toString(result2));

    }
}
