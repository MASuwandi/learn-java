package main.application;

import main.data.Car;
import main.data.R8;

public class CarApp {
    public static void main(String[] args) {

        Car car = new R8();

        System.out.println("get tier: " + car.getTier());
        car.drive();

        // use default method
        System.out.println("is big: " + car.isBig());

    }
}
