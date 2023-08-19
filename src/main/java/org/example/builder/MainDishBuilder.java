package org.example.builder;

import org.example.composite.MealBox;
import org.example.model.Beans;
import org.example.model.Beverage;
import org.example.model.Meat;
import org.example.model.Rice;

public class MainDishBuilder implements MealBuilderProtocol{
    private MealBox mealBox = new MealBox();

    public void reset(){
        this.mealBox = new MealBox();

    }
    @Override
    public MainDishBuilder makeMeal() {
        Rice rice = new Rice("Arroz",10.5);
        Beans beans = new Beans("Feijão Carioca",8.00);
        Meat meat = new Meat("Carne Moida",30.0);
        mealBox.add(rice);
        mealBox.add(beans);
        mealBox.add(meat);
        return this;
    }

    @Override
    public MainDishBuilder makeBeverage() {
        Beverage beverage = new Beverage("Coca-Cola",4.5);
        mealBox.add(beverage);
        return this;
    }

    public MealBox getMealBox(){
        return mealBox;
    }
    public double getPrice(){
        return mealBox.getPrice();
    }
}
