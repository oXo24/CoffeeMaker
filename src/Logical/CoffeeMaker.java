package Logical;

import Consumables.*;
import Interfaces.Drink;

import java.util.Scanner;

public class CoffeeMaker {
    private final CoffeeMenu coffeeMenu;
    private final Scanner scanner;

    public CoffeeMaker() {
        this.coffeeMenu = new CoffeeMenu();
        this.scanner = new Scanner(System.in);
    }

    public void choose() {
            coffeeMenu.displayMenu();
            System.out.print("Enter your choice (from 1 to 3): ");
            String choice = scanner.nextLine();

            if ("1".equals(choice)) {
                Drink espresso = new Espresso();
                espresso.prepare();
                System.out.println("Enjoy your Espresso :)");
            } else if ("2".equals(choice)) {
                Drink cappuccino = new Cappuccino();
                cappuccino.prepare();
                System.out.println("Enjoy your Cappuccino :)");
            } else if ("3".equals(choice)) {
                Drink latte = new Latte();
                latte.prepare();
                System.out.println("Enjoy your Latte :)");
            } else {
                System.out.println("Invalid choice. Please select a valid option (from 1 to 3).");
            }
            scanner.close();
    }
}