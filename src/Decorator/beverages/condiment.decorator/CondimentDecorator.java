package decorator.beverages.condiment.decorator;

import decorator.beverages.Beverages;

public abstract class CondimentDecorator extends Beverages {
    public abstract String getDescription();

    public abstract double cost();

}
