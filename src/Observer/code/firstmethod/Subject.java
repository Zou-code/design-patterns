package Observer.code.firstmethod;

/**
 * @Author 邹舟
 * @Date 2024/3/30 22:53
 * @Version 1.0
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    //当气象观测值改变时，主题会把这些状态当做参数，传递给观察者
    public void notifyObserver();
}
