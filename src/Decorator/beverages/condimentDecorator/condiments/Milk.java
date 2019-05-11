package Decorator.beverages.condimentDecorator.condiments;

import Decorator.beverages.beverages;
import Decorator.beverages.condimentDecorator.condimentDecorator;

public class Milk extends condimentDecorator {
    beverages beverage;

    public Milk(beverages beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " + milk";
    }

    public double cost(){
        return beverage.cost() + 1;
    }
}
