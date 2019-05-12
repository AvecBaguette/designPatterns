package decorator.beverages.condiment.decorator.condiments;

import decorator.beverages.Beverages;
import decorator.beverages.condiment.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverages beverage;

    public Mocha(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + mocha";
    }

    public double cost() {
        return beverage.cost() + 1.5;
    }
}
