package Beverage;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Beverage.Espresso";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}