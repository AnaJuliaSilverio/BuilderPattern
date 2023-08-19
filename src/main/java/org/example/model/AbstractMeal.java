package org.example.model;

import org.example.composite.MealCompositeProtocol;

public abstract class AbstractMeal implements MealCompositeProtocol {
    private String name;
    private double price;
    public AbstractMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
