package Decorator.beverages.CoffeeTypes;
import Decorator.beverages.beverages;
public class Espresso extends beverages{
    public String getDescription(){
        return "Espresso";
    }

    public double cost(){
        return 2.49;
    }
}
