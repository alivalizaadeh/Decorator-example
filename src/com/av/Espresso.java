package com.av;

public class Espresso implements Drink {
    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public Double getPrice() {
        return 1.0;
    }
}
