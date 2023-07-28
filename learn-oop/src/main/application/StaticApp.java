package main.application;

// replaced by static import
//import programmer.zaman.now.data.Application;
//import programmer.zaman.now.data.Constant;
import main.data.Application;
import main.data.Country;
import main.util.MathUtil;

// Static Import
import static main.data.Constant.*;

public class StaticApp {
    public static void main(String[] args) {

        // static Field
        // System.out.println("APPLICATION: " + Constant.APPLICATION);
        // System.out.println("VERSION: " + Constant.VERSION);

        // use static import
        System.out.println("APPLICATION: " + APPLICATION);
        System.out.println("VERSION: " + VERSION);

        // static Method
        System.out.println("sum: " +
                MathUtil.sum(1,2,3)
        );

        // static Inner Class
        Country.City city = new Country.City();
        city.setName("Wakanda");

        System.out.println("get city name: " + city.getName());

        // static Block
        // System.out.println("PROCESSORS: " + Application.PROCESSORS);

        System.out.println("PROCESSORS: " + Application.PROCESSORS);


    }
}
