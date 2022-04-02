package lesson10.hw10Teacher.impl;

import lesson10.hw10Teacher.Convertable;
import lesson10.hw10Teacher.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertable {

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
