package com.course.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{
    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put("Warsaw", 25.4);
        stubResult.put("Gdansk", 22.5);
        stubResult.put("Poznan", 21.4);
        stubResult.put("Wroclaw", 28.7);
        stubResult.put("Bialystok", 21.1);

        return stubResult;
    }
}
