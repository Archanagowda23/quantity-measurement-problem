package com.bridgelabz.quantity;

public class Quantitymeasurement {

    double feet;
    double inch;

    // Units -data type units - object ENUM
    public double unitComparison(Units units, double value) {
        return value * units.unit;
    }
}
