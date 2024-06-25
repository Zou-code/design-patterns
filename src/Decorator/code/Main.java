package Decorator.code;

import Decorator.code.concrete_beverage.DarkRoast;
import Decorator.code.concrete_beverage.Decaf;
import Decorator.code.concrete_beverage.HouseBlend;
import Decorator.code.concrete_condiment.Milk;
import Decorator.code.concrete_condiment.Mocha;
import Decorator.code.concrete_condiment.Soy;

public class Main {
    public static void main(String[] args) {
        //点一杯DarkRoast咖啡,不要任何调料，打印出它的描述与价钱
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + "￥" + beverage.cost());

        /*
            DarkRoast￥6.3
         */

        //点一杯调料为Mocha 和 Milk 的 Decaf咖啡
        Beverage beverage2 = new Decaf();
        //用Mocha装饰它
        beverage2 = new Mocha(beverage2);
        //用Milk装饰它
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + "￥" + beverage2.cost());

        /*
            Decaf, Mocha , Milk￥13.69
         */

        //点一杯调料为Soy、Mocha 和 Milk的 HouseBlend咖啡
        Beverage beverage3 = new HouseBlend();
        //用Soy装饰它
        beverage3 = new Soy(beverage3);
        // 用Mocha装饰它
        beverage3 = new Mocha(beverage3);
        //用Milk装饰它
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + "￥" + beverage3.cost());

        /*
            HouseBlend, Soy, Mocha , Milk￥11.79
         */
    }
}
