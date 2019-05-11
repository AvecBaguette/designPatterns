package Decorator.beverages.condimentDecorator.condiments;

import Decorator.beverages.beverages;
import Decorator.beverages.condimentDecorator.condimentDecorator;

public class Soy extends condimentDecorator {
    beverages beverage;

    public Soy(beverages beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " + soy";
    }

    public double cost(){
        return beverage.cost() + 3;
    }
}
