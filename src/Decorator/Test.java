package decorator;

import decorator.beverages.*;
import decorator.beverages.coffee.types.DarkRoast;
import decorator.beverages.coffee.types.Decaf;
import decorator.beverages.coffee.types.Espresso;
import decorator.beverages.coffee.types.HouseBlend;
import decorator.beverages.condiment.decorator.condiments.Milk;
import decorator.beverages.condiment.decorator.condiments.Mocha;
import decorator.beverages.condiment.decorator.condiments.Soy;
import decorator.beverages.condiment.decorator.condiments.Whip;


public class Test {

    public static void main(String[] args) {
        Beverages firstOrder = new Mocha(new Decaf());
        System.out.println(firstOrder.getDescription() + " costs: " + firstOrder.cost());

        Beverages secondOrder = new Milk(new Mocha(new Soy(new Espresso())));
        System.out.println(secondOrder.getDescription() + " costs: " + secondOrder.cost());

        Beverages thirdOrder = new Mocha(new Mocha(new Milk(new HouseBlend())));
        System.out.println(thirdOrder.getDescription() + " costs: " + thirdOrder.cost());

        Beverages fourthOrder = new Soy(new Soy(new Soy(new Milk(new Whip(new HouseBlend())))));
        System.out.println(fourthOrder.getDescription() + " costs: " + fourthOrder.cost());

        Beverages fifthOrder = new Mocha(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(fifthOrder.getDescription() + " costs: " + fifthOrder.cost());

        Beverages sixthOrder = new HouseBlend();
        System.out.println(sixthOrder.getDescription() + " costs: " + sixthOrder.cost());
    }
}
