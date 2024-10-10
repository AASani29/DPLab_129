package CondimentDecorator;

import Beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", CondimentDecorator.Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}
