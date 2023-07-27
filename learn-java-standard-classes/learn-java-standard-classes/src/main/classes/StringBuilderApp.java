package main.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        // String Builder
        StringBuilder builder = new StringBuilder();
        builder.append("Rocket");
        builder.append(" ");
        builder.append("Baby");
        builder.append(" ");
        builder.append("Racoon");

        String name = builder.toString();
        // proses above created 1 data in memory

        System.out.println(name);

        // manual string
        String nameM = "Rocket";
        nameM = nameM + " " + "Baby";
        nameM = nameM + " " + "Racoon";
        // proses above created 3 data in memory
        // Rocket
        // Rocket Baby
        // Rocket Baby Racoon
        System.out.println(nameM);

    }
}
