import Beverage.Beverage;
import CondimentDecorator.Milk;
import CondimentDecorator.Sugar;
import CondimentDecorator.WhippedCream;
import Beverage.Espresso;
import Beverage.Cappuccino;
import Beverage.Latte;

public class Main {
    public static void main(String[] args) {
        // Order a simple Beverage.Espresso
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // Order a Beverage.Latte with CondimentDecorator.Milk and CondimentDecorator.Sugar
        Beverage beverage2 = new Latte();
        beverage2 = new Milk(beverage2);  // Add milk
        beverage2 = new Sugar(beverage2); // Add sugar
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // Order a Beverage.Cappuccino with double CondimentDecorator.Milk and Whipped Cream
        Beverage beverage3 = new Cappuccino();
        beverage3 = new Milk(beverage3);   // Add milk
        beverage3 = new Milk(beverage3);   // Add milk again
        beverage3 = new WhippedCream(beverage3); // Add whipped cream
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}