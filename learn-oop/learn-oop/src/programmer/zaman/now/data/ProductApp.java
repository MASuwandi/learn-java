package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Mac Book Pro", 30_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        // override toString method
        // calling toString by default
        System.out.println(product);

        Product product2 = new Product("Mac Book Pro", 30_000_000);

        // without override false
        System.out.println("Compare Object: ");
        System.out.println(product.equals(product2));

        System.out.println("Compare Hash Code: ");
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
