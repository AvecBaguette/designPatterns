package Decorator.beverages.CoffeeTypes;
import Decorator.beverages.beverages;
public class HouseBlend extends beverages{
    public String getDescription(){
        return "House Blend";
    }

    public double cost(){
        return 4.99;
    }
}
