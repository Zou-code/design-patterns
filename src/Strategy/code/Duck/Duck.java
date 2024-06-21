package Strategy.code.Duck;

import Strategy.code.Behavior.FlyBehavior;
import Strategy.code.Behavior.QuackBehavior;

/**
 * @Author 邹舟
 * @Date 2024/3/26 9:05
 * @Version 1.0
 */
abstract public class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void swim(){
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
}
