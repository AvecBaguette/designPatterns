package Decorator.beverages.CoffeeTypes;
import Decorator.beverages.beverages;
public class DarkRoast extends beverages{
    public String getDescription(){
        return "Dark Roast";
    }

    public double cost(){
        return 3.49;
    }

}
