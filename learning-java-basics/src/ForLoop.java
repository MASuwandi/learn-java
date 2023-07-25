public class ForLoop {
    public static void main(String[] args) {

        // Forever Loop
        // Form 1:
        // for (;;) {
        //      System.out.println("For Loop");
        // }

        // Form 2:
        // var counter = 1;

        // for (;counter <= 10;) {
        //     System.out.println("For Loop + condition: " + counter);
        //
        //     counter++;
        // }

        // Form 3:
        // for (;counter <= 10; counter++;) {
        //     System.out.println("For Loop + condition: " + counter);
        // }

        // Form 4:
         for (var counter = 1;counter <= 10; counter++) {
             System.out.println("For Loop + condition: " + counter);
         }

        String[] heroes = {
                "Thor", "Rocket",
                "Groot", "Iron Man"
        };
        for(var i = 0;i < heroes.length; i++) {
            System.out.println("Hero Name: " + heroes[i]);
        }
    }
}
