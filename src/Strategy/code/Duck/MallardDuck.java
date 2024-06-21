package Strategy.code.Duck;

import Strategy.code.Behavior.FlyBehavior;
import Strategy.code.Behavior.FlyWithWings;
import Strategy.code.Behavior.Quack;
import Strategy.code.Behavior.QuackBehavior;

/**
 * @Author 邹舟
 * @Date 2024/3/26 9:17
 * @Version 1.0
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
