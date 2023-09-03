package Logical;

import Interfaces.Menu;

public class CoffeeMenu implements Menu {
    public void displayMenu() {
        System.out.println("Choose a drink:");
        System.out.println("1 - Espresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Latte");
    }
}