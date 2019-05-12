package decorator.beverages.condiment.decorator.condiments;

import decorator.beverages.Beverages;
import decorator.beverages.condiment.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverages beverage;

    public Whip(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + whip";
    }

    public double cost() {
        return beverage.cost() + 2;
    }

}
