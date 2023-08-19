package org.example;

import org.example.builder.MainDishBuilder;

public class Main
{
    public static void main( String[] args )
    {
        MainDishBuilder mainDishBuilder = new MainDishBuilder();
        mainDishBuilder.makeMeal().makeBeverage();
        System.out.println(mainDishBuilder.getPrice());
    }
}
