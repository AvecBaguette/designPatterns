package decorator.beverages;

public abstract class Beverages {
    String description;

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

}
