package lesson10.hw10Teacher.impl;

import lesson10.hw10Teacher.Convertable;
import lesson10.hw10Teacher.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
