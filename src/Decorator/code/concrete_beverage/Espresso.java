package Decorator.code.concrete_beverage;


import Decorator.code.Beverage;

public class Espresso extends Beverage {

    /*
        写一个构造器，用来设置饮料的描述
        description变量继承自Beverage
     */
    public Espresso(){
        super.description = "Espresso";
    }

    /*
        计算Espresso 的价格，不需要管调料的价钱，
        直接返回Espress咖啡的价钱 ￥ 7.99 即可
     */
    @Override
    public double cost() {
        return 7.99;
    }
}
