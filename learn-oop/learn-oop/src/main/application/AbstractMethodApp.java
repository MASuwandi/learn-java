package main.application;

import main.annotation.Fancy;
import main.data.Animal;
import main.data.Cat;

@Fancy(name = "AbstractMethodApp", tags = {"Application", "Java"})
public class AbstractMethodApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Jumbo";
        animal.run();
    }
}
