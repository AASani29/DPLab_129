package Beverage;

public class Latte implements Beverage {
    @Override
    public String getDescription() {
        return "Beverage.Latte";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
