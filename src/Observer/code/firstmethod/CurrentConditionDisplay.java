package Observer.code.firstmethod;

import javax.swing.text.Element;

/**
 * @Author 邹舟
 * @Date 2024/3/31 10:28
 * @Version 1.0
 */
public class CurrentConditionDisplay implements DisplayElement,Observer {
    private float temperature;
    private float humudity;

    private float pressure;

    private Subject weatherData;

    //向构造方法中传入一个WeatherData对象，作为注册使用
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+ humudity +
                "% humidity" + "pressure:"+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humudity = humidity;
        this.pressure = pressure;
        display();
    }
}
