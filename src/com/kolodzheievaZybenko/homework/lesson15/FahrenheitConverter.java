package com.kolodzheievaZybenko.homework.lesson15;

public class FahrenheitConverter implements Converter {

    public double convert(double temperatureCelsius) {
        return temperatureCelsius * 1.8 + 32;
    }
}