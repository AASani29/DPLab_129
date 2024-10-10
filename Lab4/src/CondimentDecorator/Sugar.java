package CondimentDecorator;

import Beverage.Beverage;

public class Sugar extends CondimentDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", CondimentDecorator.Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
