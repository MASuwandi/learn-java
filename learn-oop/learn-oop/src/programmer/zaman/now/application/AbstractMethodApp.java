package programmer.zaman.now.application;

import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

public class AbstractMethodApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Jumbo";
        animal.run();
    }
}
