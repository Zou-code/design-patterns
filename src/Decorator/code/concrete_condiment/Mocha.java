package Decorator.code.concrete_condiment;

import Decorator.code.Beverage;
import Decorator.code.CondimentDecorator;


public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        /*
            要计算Mocha饮料的价钱，首先把调用委托给被装饰对象，以计算价格
            然后再加上Mocha的价钱，得到最后的价钱
         */
        return 1.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        /*
            描述的不仅是饮料，而是完整地连调料都描述出来
         */
        return beverage.getDescription() + ", Mocha";
    }
}
