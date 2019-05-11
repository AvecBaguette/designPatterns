package Decorator.beverages.condimentDecorator.condiments;

import Decorator.beverages.beverages;
import Decorator.beverages.condimentDecorator.condimentDecorator;

public class Mocha extends condimentDecorator {
    beverages beverage;

    public Mocha(beverages beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " + mocha";
    }

    public double cost(){
        return beverage.cost() + 1.5;
    }
}
