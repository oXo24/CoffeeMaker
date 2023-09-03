package Consumables;

import Interfaces.Drink;

public class Espresso implements Drink {
    @Override
    public void prepare() {
        System.out.println("Making Espresso...");
    }
}