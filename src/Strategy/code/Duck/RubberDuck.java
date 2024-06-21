package Strategy.code.Duck;

import Strategy.code.Behavior.*;
import Strategy.code.Duck.Duck;

/**
 * @Author 邹舟
 * @Date 2024/3/26 9:13
 * @Version 1.0
 */
public class RubberDuck extends Duck {
    QuackBehavior quackable;

    FlyBehavior flyBehavior;

    public RubberDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackable = new MuteQuack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackable.quack();
    }

    public void setQuackable(QuackBehavior quackable){
        this.quackable = quackable;
    }

    public void setFlyable(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }
}
