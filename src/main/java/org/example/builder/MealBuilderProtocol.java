package org.example.builder;

import org.example.composite.MealBox;


public interface MealBuilderProtocol {
    MealBuilderProtocol makeMeal();
    MealBuilderProtocol makeBeverage();
}
