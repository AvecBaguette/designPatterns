package decorator.beverages.condiment.decorator.condiments;

import decorator.beverages.Beverages;
import decorator.beverages.condiment.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverages beverage;

    public Soy(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + soy";
    }

    public double cost() {
        return beverage.cost() + 3;
    }
}
