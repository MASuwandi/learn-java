package main.data;

import main.annotation.Fancy;

// multiple extends
@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends HasBrand, IsMaintenance {

    // by default method has public abstract type
    void drive();

    int getTier();

    // Default method
    // with default method as if all who use Car interface
    // has isBig method in their class.
    default boolean isBig() {
        return false;
    }
}
