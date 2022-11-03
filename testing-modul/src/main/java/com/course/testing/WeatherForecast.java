package com.course.testing;

import com.course.testing.weather.stub.Temperatures;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.1);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {
        Double sum = 0.0;

        for (Double value : temperatures.getTemperatures().values()) {
            sum += value;
        }
        double averageTemperature = sum / temperatures.getTemperatures().size();
        return averageTemperature;
    }

}
