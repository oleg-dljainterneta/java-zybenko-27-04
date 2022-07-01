package com.kolodzheievaZybenko.homework.lesson14.propertytax;

public class RealEstate {
    protected int square;
    protected int taxPerSquareMeter;

    public RealEstate(int taxPerSquareMeter, int square) {
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
