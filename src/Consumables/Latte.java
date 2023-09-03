package Consumables;

import Interfaces.Drink;

public class Latte implements Drink {
    @Override
    public void prepare() {
        System.out.println("Making Latte...");
    }
}
