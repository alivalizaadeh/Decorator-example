package com.av;

public class SugarDecorator implements Drink{

    private final Drink drink;

    public SugarDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getName() {
        return drink.getName() + " with Sugar ";
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.1;
    }
}
