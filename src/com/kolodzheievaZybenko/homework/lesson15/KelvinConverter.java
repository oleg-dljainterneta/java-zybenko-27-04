package com.kolodzheievaZybenko.homework.lesson15;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double temperatureCelsius) {
        return temperatureCelsius + 273.15;

    }
}