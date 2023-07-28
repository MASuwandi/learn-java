package main.data;

import main.annotation.Fancy;

@Fancy(name = "Level", tags = {"Application", "Java"})
public enum Level {

    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    private String description;

    // constructor
    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
