package com.kolodzheievaZybenko.homework.lesson14.propertyTax;

public class IndustrialRealEstate extends PropertyTax {
    public IndustrialRealEstate(int square, int taxPerSquareMeter) {
        super(square, taxPerSquareMeter);
    }

    @Override
    public String toString() {
        return "Factory {" +
                "square= " + square + " m^2" +
                ", Tax per square meter=" + taxPerSquareMeter + " USD/m^2" +
                '}';
    }
}
