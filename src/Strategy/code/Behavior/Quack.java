package Strategy.code.Behavior;

/**
 * @Author 邹舟
 * @Date 2024/3/26 9:11
 * @Version 1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack gagaga");
    }
}
