package lesson10.hw10Teacher.impl;

import lesson10.hw10Teacher.Convertable;
import lesson10.hw10Teacher.TemperatureValue;

import static lesson10.hw10Teacher.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsiusConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
