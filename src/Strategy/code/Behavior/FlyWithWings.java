package Strategy.code.Behavior;

/**
 * @Author 邹舟
 * @Date 2024/3/26 9:08
 * @Version 1.0
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
