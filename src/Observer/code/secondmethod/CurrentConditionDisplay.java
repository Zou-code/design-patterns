package Observer.code.secondmethod;

import Observer.code.firstmethod.DisplayElement;
import Observer.code.secondmethod.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author 邹舟
 * @Date 2024/3/31 11:52
 * @Version 1.0
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and"+humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
