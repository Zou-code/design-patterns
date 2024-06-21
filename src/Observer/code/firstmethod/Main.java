package Observer.code.firstmethod;

/**
 * @Author 邹舟
 * @Date 2024/3/31 10:37
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        Observer curr = new CurrentConditionDisplay(weather);

        weather.setMeasurements(80,65,30.4f);
        weather.setMeasurements(82,70,29.2f);
        weather.setMeasurements(82,70,29.2f);
        weather.setMeasurements(80,65,30.4f);

    }
}
