package com.av;

public class Main {
    public static void main(String[] args) {
        Drink espresso = new Espresso();

        Drink latte = new MilkDecorator(espresso);

        Drink espressoWithSugar = new SugarDecorator(espresso);

        Drink latteWithSugar = new SugarDecorator(latte);

        System.out.println("Name : " + espresso.getName() + ", Price : " + espresso.getPrice());
        System.out.println("Name : " + latte.getName() + ", Price : " + latte.getPrice());
        System.out.println("Name : " + espressoWithSugar.getName() + ", Price : " + espressoWithSugar.getPrice());
        System.out.println("Name : " + latteWithSugar.getName() + ", Price : " + latteWithSugar.getPrice());

    }
}