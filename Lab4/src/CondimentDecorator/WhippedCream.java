package CondimentDecorator;

import Beverage.Beverage;

public class WhippedCream extends CondimentDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}