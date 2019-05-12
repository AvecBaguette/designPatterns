
package decorator.beverages.coffee.types;

import decorator.beverages.Beverages;

public class DarkRoast extends Beverages {
    public String getDescription() {
        return "Dark Roast";
    }

    public double cost() {
        return 3.49;
    }

}