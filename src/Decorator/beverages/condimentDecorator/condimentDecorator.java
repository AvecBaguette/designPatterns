package Decorator.beverages.condimentDecorator;

import Decorator.beverages.beverages;

public abstract class condimentDecorator extends beverages {
    public abstract String getDescription();

    public abstract double cost();

}
