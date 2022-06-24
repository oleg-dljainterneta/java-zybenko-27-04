package com.kolodzheievaZybenko.homework.lesson14.propertyTax;

public class PropertyTax {
    protected int square;
    protected int taxPerSquareMeter;

    public PropertyTax(int taxPerSquareMeter, int square) {
        this.taxPerSquareMeter = taxPerSquareMeter;
        this.square = square;
    }

    public double calculateTax() {
        return square * taxPerSquareMeter;
    }

    @Override
    public String toString() {
        return "Building {" +
                "square= " + square +
                ", tax per square meter= " + taxPerSquareMeter + "USD/m^2" +
                '}';
    }
}
