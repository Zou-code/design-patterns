package Decorator.code.concrete_beverage;

import Decorator.code.Beverage;

/**
 * @Author 邹舟
 * @Date 2024/6/25 21:07
 * @Version 1.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        super.description = "HouseBlend";
    }

    /*
        另一种饮料，做法和Espresso一样
        只是把名称改为 HouseBlend，并返回正确的价钱 ￥6.89
     */
    @Override
    public double cost() {
        return 6.89;
    }
}
