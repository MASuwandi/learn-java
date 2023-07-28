public class BreakContinue {
    public static void main(String[] args) {

        // Break
        var counter = 1;

        while (true) {
            System.out.println("Perulangan ke-: " + counter);
            counter++;

            if (counter > 10) break;
        }

        System.out.println("Break is Over!");

        // Continue
        // suitable with for, because post statement
        var counter2 = 1;

        while (counter2 <= 10) {
            if (counter2 % 2 == 0) {
                counter2++;
                continue;
            }

            System.out.println("Perulangan Ganjil-: " + counter2);
            counter2++;
        }

    }
}
