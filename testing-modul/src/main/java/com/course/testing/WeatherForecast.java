package com.course.testing;

import com.course.testing.weather.stub.Temperatures;

import java.util.*;

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

    public Double calculateMedianTemperature() {

        double median = 0;
        ArrayList<Double> numberList = new ArrayList<>();
        for (Map.Entry<String ,Double> temperature : temperatures.getTemperatures().entrySet()) {
            numberList.add(temperature.getValue());
        }
        Collections.sort(numberList);
        if (numberList.size() % 2 == 0) {
            int sum = 0;
            for (double element : numberList) {
                sum += element;
            }
            median = sum / 2;
        } else {
            Collections.sort(numberList);
            median = (numberList.get((numberList.size() - 1) / 2) + numberList.get(numberList.size() / 2)) / 2;
        }
        return median;
    }
}
