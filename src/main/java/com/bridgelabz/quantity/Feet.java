package com.bridgelabz.quantity;

public class Feet {
    private double value = 0.0;

    public Feet(double value) {
        this.value = value;
    }
    public Feet(){

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Feet other = (Feet) obj;
        return Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
    }
    public void setValue(int i) {
        // TODO Auto-generated method stub

    }

    public String getValue() {
        // TODO Auto-generated method stub
        return null;
    }
}

