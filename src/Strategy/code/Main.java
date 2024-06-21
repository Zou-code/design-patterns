package Strategy.code;

import Strategy.code.Behavior.FlyAsJet;
import Strategy.code.Behavior.FlyWithWings;
import Strategy.code.Duck.Duck;
import Strategy.code.Duck.MallardDuck;
import Strategy.code.Duck.ModelDuck;
import Strategy.code.Duck.RubberDuck;

/**
 * @Author 邹舟
 * @Date 2024/3/26 19:01
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack(); //I can quack gagaga
        mallardDuck.performFly(); //I can fly with wings
        mallardDuck.display(); //I am a mallard duck

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly(); //I can not fly
        modelDuck.performQuack(); //I can quack gagaga
        modelDuck.display(); // I am a model duck

        //下面开始改变模型鸭的行为，让它像火箭一样飞
        modelDuck.setFlyBehavior(new FlyAsJet());
        modelDuck.performFly(); //I can fly as a jet
    }
}
