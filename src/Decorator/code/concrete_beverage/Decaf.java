package Decorator.code.concrete_beverage;

import Decorator.code.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        super.description = "Decaf";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
