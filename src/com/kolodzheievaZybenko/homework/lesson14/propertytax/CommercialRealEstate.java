package com.kolodzheievaZybenko.homework.lesson14.propertytax;

public class CommercialRealEstate extends RealEstate {
    private int revenue;

    public CommercialRealEstate(int square, int taxPerSquareMeter, int revenue) {
        super(square, taxPerSquareMeter);
        this.revenue = revenue;
    }

    @Override
    public double calculateTax() {

        if (revenue < 100.0) {
            return 0;
        }
        return super.calculateTax();
    }

    @Override
    public String toString() {
        return "Score {" +
                "square = " + square + " m^2" +
                ", Tax per square meter = " + taxPerSquareMeter + " USD/m^2 " +
                ", revenue = " + revenue + " USD" +
                '}';
    }
}