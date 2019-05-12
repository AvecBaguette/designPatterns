package decorator.beverages.coffee.types;

import decorator.beverages.Beverages;

public class Decaf extends Beverages {
    public String getDescription() {
        return "Decaf";
    }

    public double cost() {
        return 7.99;
    }
}
