package com.kolodzheievaZybenko.homework.lesson15;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConverterMain {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        do {
            convertTemperature();
        } while (!(READER.readLine()).equalsIgnoreCase("exit"));

    }

    public static void convertTemperature() throws IOException {

        System.out.println("Input temperature celsius: ");
        double temperature = Double.parseDouble(READER.readLine());
        System.out.println("Choose system: KELVIN or FAHRENHEIT ");
        String input = READER.readLine();
        System.out.println("After conversation temperature = "
                + createConverter(ConverterType.valueOf(input)).convert(temperature));
        System.out.println("Type 'exit' or press anything");

    }

    public static Converter createConverter(ConverterType type) {
        return switch (type) {
            case FAHRENHEIT -> new FahrenheitConverter();
            case KELVIN -> new KelvinConverter();
        };
    }
}