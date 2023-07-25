package programmer.zaman.now.application;

import programmer.zaman.now.data.City;

public class AbstractClassApp {
    public static void main(String[] args) {

        // error because class set to abstract
//        var location = new Location("Wakanda");
        var city = new City();
        city.name = "Wakanda";
    }
}
