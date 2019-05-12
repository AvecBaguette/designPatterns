package decorator.beverages.coffee.types;

import decorator.beverages.Beverages;

public class HouseBlend extends Beverages {
    public String getDescription() {
        return "House Blend";
    }

    public double cost() {
        return 5;
    }
}