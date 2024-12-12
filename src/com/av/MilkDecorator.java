package com.av;

public class MilkDecorator implements Drink{

    private final Drink drink;

    public MilkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getName() {
        return drink.getName() + " with Milk ";
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5;
    }
}
