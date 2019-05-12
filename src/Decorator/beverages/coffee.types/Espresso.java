package decorator.beverages.coffee.types;

import decorator.beverages.Beverages;

public class Espresso extends Beverages {
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 2.49;
    }
}
