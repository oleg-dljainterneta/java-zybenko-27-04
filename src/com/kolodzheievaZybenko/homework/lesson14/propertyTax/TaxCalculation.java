package com.kolodzheievaZybenko.homework.lesson14.propertyTax;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaxCalculation {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<PropertyTax> PropertyTax = new ArrayList<>();
        String input;
        System.out.println(" Select property type \n RESIDENTIAL / COMMERCIAL / INDUSTRIAL \n Then type exit");
        while (!(input = READER.readLine()).equalsIgnoreCase("exit")) {
            try {
                PropertyTax.add(createPropertyTax(TypesOfRealEstate.valueOf(input.toUpperCase())));
            } catch (IllegalArgumentException e) {
                System.out.println(" Incorrect data, try again");
            }
        }
        for (PropertyTax taxes1 : PropertyTax) {
            System.out.println("Tax = " + taxes1.calculateTax());
        }
    }

    public static PropertyTax createPropertyTax(TypesOfRealEstate type) throws IOException {
        switch (type) {
            case RESIDENTIAL -> {
                System.out.println("Input: Square, tax per square meter, percent ");
                return new ResidentialProperties(inputData(), inputData(), inputPercent());
            }
            case COMMERCIAL -> {
                System.out.println("Input: Square, tax per square meter, revenue ");
                return new CommercialRealEstate(inputData(), inputData(), inputData());
            }
            case INDUSTRIAL -> {
                System.out.println("Input: Square, tax per square meter, revenue ");
                return new IndustrialRealEstate(inputData(), inputData());
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public static int inputData() throws IOException {
        int input;
        input = Integer.parseInt(READER.readLine());

        if (input < 0) {
            System.out.println("Incorrect data, please, try again");
            inputData();
        }
        return input;
    }

    public static int inputPercent() throws IOException {
        int input;
        input = Integer.parseInt(READER.readLine());

        if (input < 0 || input > 100) {
            System.out.println("Incorrect data, please, try again");
            inputPercent();
        }
        return input;
    }

}
