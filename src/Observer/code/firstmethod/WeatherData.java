package Observer.code.firstmethod;

import java.util.ArrayList;

/**
 * @Author 邹舟
 * @Date 2024/3/30 23:03
 * @Version 1.0
 */
public class WeatherData implements Subject{

    //这个ArrayList用来记录观察者，这个ArrayList在构造方法中建立
    //当注册观察者时，只需要把它加到ArrayList中即可
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //遍历这个ArrayList，把状态告诉每一个观察者
    @Override
    public void notifyObserver() {
        for(Observer ob : observers){
            ob.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanges(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        //每次设置好温度湿度和压强的时候，都触发改变
        measurementsChanges();
    }
}
