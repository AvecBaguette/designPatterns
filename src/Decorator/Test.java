package Decorator;

import Decorator.beverages.*;
import Decorator.beverages.CoffeeTypes.*;
import Decorator.beverages.condimentDecorator.condiments.*;


public class Test {

    public static void main(String[] args) {
        beverages firstOrder = new Mocha(new Decaf());
        System.out.println(firstOrder.getDescription() + " costs: " + firstOrder.cost());

        beverages secondOrder = new Milk(new Mocha(new Soy(new Espresso())));
        System.out.println(secondOrder.getDescription() + " costs: " + secondOrder.cost());

        beverages thirdOrder = new Mocha(new Mocha(new Milk(new HouseBlend())));
        System.out.println(thirdOrder.getDescription() + " costs: " + thirdOrder.cost());

        beverages fourthOrder = new Soy(new Soy(new Soy(new Milk(new Whip(new HouseBlend())))));
        System.out.println(fourthOrder.getDescription() + " costs: " + fourthOrder.cost());

        beverages fifthOrder = new Mocha(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(fifthOrder.getDescription() + " costs: " + fifthOrder.cost());

        beverages sixthOrder = new HouseBlend();
        System.out.println(sixthOrder.getDescription() + " costs: " + sixthOrder.cost());
    }
}


