package com.course.testing.weather.mock;

import com.course.testing.WeatherForecast;
import com.course.testing.weather.stub.Temperatures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuiteMock {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String ,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Waw", 20.4);
        temperaturesMap.put("Kra", 22.1);
        temperaturesMap.put("Wro", 21.4);
        temperaturesMap.put("Gda", 21.7);
        temperaturesMap.put("Poz", 22.4);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap); //using the "Mock"
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTempWithMock() {
        //Given
        Map<String ,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Waw", 20.4);
        temperaturesMap.put("Kra", 22.1);
        temperaturesMap.put("Wro", 21.4);
        temperaturesMap.put("Gda", 21.7);
        temperaturesMap.put("Poz", 22.4);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap); //using the "Mock"
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();
        System.out.println(averageTemperature);

        //Then
        Assertions.assertEquals(21.6, averageTemperature);
    }

    @Test
    void testCalculateMedianTempWithMock() {
        //Given
        Map<String ,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Waw", 20.4);
        temperaturesMap.put("Kra", 22.1);
        temperaturesMap.put("Wro", 21.4);
        temperaturesMap.put("Gda", 21.7);
        temperaturesMap.put("Poz", 22.4);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap); //using the "Mock"
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemperature = weatherForecast.calculateAverageTemperature();
        System.out.println(medianTemperature);

        //Then
        Assertions.assertEquals(21.6, medianTemperature);
    }
}
