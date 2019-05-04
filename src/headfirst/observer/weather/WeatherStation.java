package headfirst.observer.weather;

/**
 * Created by Gavin on 2017/2/13.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay/*当前条件显示*/ currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay/*统计显示*/ statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay/*预测显示*/ forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
