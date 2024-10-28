package com.example.demo;

public abstract class Item {
    protected String description = "Unknown Item";

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();
}
