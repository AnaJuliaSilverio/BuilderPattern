package org.example.builder;

import org.example.composite.MealBox;

public class MainDishDirector {
    public MealBox makeCombo(MainDishBuilder mainDishBuilder){
        mainDishBuilder.makeMeal();
        mainDishBuilder.makeBeverage();
        return mainDishBuilder.getMealBox();
    }
}
