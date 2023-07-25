package programmer.zaman.now.application;

import programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Mac Book Air", 16_000_000);

        // can't access field because of protected type
        // and were located outside the package or child package
//        System.out.println(product.name);
//        System.out.println(product.price);

        Data data = new Data();
    }
}
