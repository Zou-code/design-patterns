package Observer.code.secondmethod;

import java.util.Observable;

/**
 * @Author 邹舟
 * @Date 2024/3/31 11:45
 * @Version 1.0
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChanged(){
        super.setChanged();
        //使用“pull"的方式，所以在通知观察者的时候没有传递数据对象
        super.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    //观察者们可以通过下面的getter方法根据它们的需求拉到它们想要的数据
    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
    }
}
