package Decorator.code.concrete_beverage;

import Decorator.code.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        super.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 6.3;
    }
}
