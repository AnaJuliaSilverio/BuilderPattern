package org.example;

import org.example.builder.MainDishBuilder;
import org.example.builder.MainDishDirector;
import org.example.composite.MealBox;

public class Main
{
    public static void main( String[] args )
    {
        MainDishBuilder mainDishBuilder = new MainDishBuilder();
        MainDishDirector mainDishDirector = new MainDishDirector();
       MealBox mealBox = mainDishDirector.makeCombo(mainDishBuilder);
        System.out.println("O total do pedido é R$"+mealBox.getPrice());

    }
}
