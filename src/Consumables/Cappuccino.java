package Consumables;

import Interfaces.Drink;

public class Cappuccino implements Drink {
    @Override
    public void prepare() {
        System.out.println("Making Cappuccino...");
    }
}
