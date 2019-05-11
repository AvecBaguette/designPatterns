package Decorator;

import Decorator.beverages.*;
import Decorator.beverages.CoffeeTypes.*;
import Decorator.beverages.condimentDecorator.condiments.*;


public class Test {

    public static void main(String[] args) {
        beverages firstOrder= new Mocha(new Decaf());
        System.out.println(firstOrder.getDescription()+ " costs: " + firstOrder.cost());

        beverages secondOrder= new Milk(new Mocha( new Soy( new Espresso())));
        System.out.println(secondOrder.getDescription()+ " costs: " + secondOrder.cost());


    }
}
