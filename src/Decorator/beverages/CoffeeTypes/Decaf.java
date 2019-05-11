package Decorator.beverages.CoffeeTypes;

import Decorator.beverages.beverages;

public class Decaf extends beverages {
    public String getDescription() {
        return "Decaf";
    }

    public double cost() {
        return 7.99;
    }
}
