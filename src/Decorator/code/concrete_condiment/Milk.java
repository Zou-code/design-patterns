package Decorator.code.concrete_condiment;

import Decorator.code.Beverage;
import Decorator.code.CondimentDecorator;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2.5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }
}
