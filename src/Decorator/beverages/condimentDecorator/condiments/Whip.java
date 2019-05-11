package Decorator.beverages.condimentDecorator.condiments;

import Decorator.beverages.beverages;
import Decorator.beverages.condimentDecorator.condimentDecorator;

public class Whip extends condimentDecorator {
    beverages beverage;

    public Whip(beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + whip";
    }

    public double cost() {
        return beverage.cost() + 2;
    }

}
