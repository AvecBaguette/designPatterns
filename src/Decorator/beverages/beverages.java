package Decorator.beverages;

public abstract class beverages {
    String description;

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

}
