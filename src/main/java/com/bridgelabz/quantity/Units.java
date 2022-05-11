package com.bridgelabz.quantity;

public enum Units {
    FEET(12), INCH(1);

    public double unit;

    // let us inch as reference
    Units(double unit) {
        this.unit = unit;
    }
}
