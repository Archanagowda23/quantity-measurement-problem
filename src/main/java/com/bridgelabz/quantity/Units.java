package com.bridgelabz.quantity;

public enum Units {
    FEET(30.48), INCH(2.5), YARD(90),CM(1);

    public double unit;

    // let us inch as reference
    Units(double unit) {
        this.unit = unit;
    }
}
