package Strategy.code.Duck;

import Strategy.code.Behavior.FlyBehavior;
import Strategy.code.Behavior.FlyNoWay;
import Strategy.code.Behavior.Quack;

/**
 * @Author 邹舟
 * @Date 2024/3/26 18:52
 * @Version 1.0
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();   //一开始，模型鸭是不会飞的
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
