package com.kolodzheievaZybenko.homework.lesson14.propertyTax;

public class ResidentialProperties extends PropertyTax {
    private int percent;

    public ResidentialProperties(int square, int taxPerSquareMeter, int percent) {
        super(square, taxPerSquareMeter);
        this.percent = percent;
    }

    @Override
    public double calculateTax() {
        return square * taxPerSquareMeter * (1 - percent / 100.0);

    }

    @Override
    public String toString() {
        return "Flat {" +
                "square= " + square + " m^2" +
                ", Tax per square meter= " + taxPerSquareMeter + " USD/m^2" +
                ", percent= " + percent + " %" +
                '}';
    }
}
