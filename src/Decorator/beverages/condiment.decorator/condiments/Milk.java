package decorator.beverages.condiment.decorator.condiments;

import decorator.beverages.Beverages;
import decorator.beverages.condiment.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverages beverage;

    public Milk(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + milk";
    }

    public double cost() {
        return beverage.cost() + 1;
    }
}
