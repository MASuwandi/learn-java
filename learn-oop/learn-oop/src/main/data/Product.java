package main.data;

import java.util.Objects;

// public can be access from everywhere
public class Product {

    // protected can't be access from outside data package
    protected String name;
    protected int price;

    // public can be access from everywhere
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    // override toString method
    public String toString() {
        return "Product name: " + this.name + ", price: " + this.price;
    }

    // equals() Method
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (price != product.price)
            return false;

        if (this.name != null)
            return name.equals(product.name);
        else
            return product.name == null;

        // short form
//        return name != null ? name.equals(product.name) : product.name == null;
    }

    // HashCode Method
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
