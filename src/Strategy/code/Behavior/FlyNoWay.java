package Strategy.code.Behavior;

/**
 * @Author 邹舟
 * @Date 2024/3/26 18:59
 * @Version 1.0
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
