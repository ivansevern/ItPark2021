package lesson10.hw10Teacher.impl;

import lesson10.hw10Teacher.Convertable;
import lesson10.hw10Teacher.TemperatureValue;

import static lesson10.hw10Teacher.impl.FahrenheitToCelsiusConverter.DELTA;
import static lesson10.hw10Teacher.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
