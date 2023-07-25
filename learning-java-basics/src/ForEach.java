
public class ForEach {
    public static void main(String[] args) {

        String[] array = {
                "Thor", "Rocket",
                "Groot", "Iron Man"
        };

        for (var el: array) {
            System.out.println("Hero Name: " + el);
        }
    }
}
