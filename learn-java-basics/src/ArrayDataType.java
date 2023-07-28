import java.util.Arrays;

public class ArrayDataType {
    public static void main(String[] args) {

        // Tipe Data Array
        // Membuat Array use []
        // Membuat variabel
        String[] arrayString;

        // Inisialisasi
        arrayString = new String[3];

        // Update isi array
        arrayString[0] = "Rocket";
        arrayString[1] = "Racoon";

        int[] arrInt = new int[3];

        System.out.println(Arrays.toString(arrayString));
        System.out.println(arrayString[0]);

        // Code: Array Initializer
        String[] heroes = new String[]{
                "Racon", "Groot", "Thor"
        };

        int[] arrayInt = new int[]{
                1, 2, 3
        };

        long[] arrayLong = new long[]{
                10L, 20L, 30L
        };

        System.out.println("Array Length: " + arrayLong.length);


        // Code: Array di dalam Array
        String[][] members = {
                { "Thor", "Groot" },
                { "Strange", "Racon" }
        };

        System.out.println("members: " + members[0]);
        System.out.println("members: " + members[1][0]);

    }
}
