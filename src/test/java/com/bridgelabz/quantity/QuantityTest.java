package com.bridgelabz.quantity;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

//Test Case 1.1
public class QuantityTest {

    private Quantitymeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new Quantitymeasurement();
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    //TC 1.2 Null Check
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Assert.assertNotNull(value1);
    }

    //TC 1.3 Type Check
    @Test
    public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
        Assert.assertSame(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
        Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
    }

    //TC 1.4 Value Check For Equality

    @Test
    public void giveSameTypesOfObjects_shouldReturnEqual() {
        Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement1);
    }

    @Test
    public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
        Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
        QuantityTest quantityTest = new QuantityTest();
        Assert.assertNotEquals(quantityMeasurement1, quantityTest);
    }

    // TC 1.5 Value Check for equality
    @Test
    public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
        double value2 = quantityMeasurement1.unitComparison(Units.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
        double value2 = quantityMeasurement1.unitComparison(Units.FEET, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    //TC 1.7 - Different Inch value test.
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
     * 0 inch and 1 inch not equal
     */

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
     * comparing the object with null
     */

    @Test
    public void givenInchObjectWhenComparedWithNullValue_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        Assert.assertNotNull(quantityMeasurement);
    }
    // TC 1.9 - Reference Check

    @Test
    public void givenInchReferenceObject_WhenSame_ShouldReturnTrue() {
        Assert.assertSame(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenInchReferenceObject_WhenNotSame_ShouldReturnTrue() {
        Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
    }

    // TC 1.10 - Type Check
    @Test
    public void givenTwoTypesOfObject_WhenNotEqual_ShouldReturnTrue() {
        QuantityTest quantityTest = new QuantityTest();
        Assert.assertNotEquals(quantityTest, quantityMeasurement);
    }

    // TC 1.11 - Value check for equality
    @Test
    public void givenTwoSameValuesOfDifferentObjects_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = new Quantitymeasurement().unitComparison(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    // TC 1.12 - Value check for different values
    @Test
    public void givenTwoDifferentValuesOfDifferentObjects_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = new Quantitymeasurement().unitComparison(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    //UC2
    /*
     * TC 1.11 for comparing lengths of 2 yard variables
     */
    @Test
    public void given0YardAnd0YardWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0YardAnd1YardWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
     * TC 1.12 for comparing lengths 1: 3ft = 1yd
     */
    @Test
    public void given3FeetAnd1YardWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 3.0);
        double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
     * TC 1.13 for comparing lengths 2: 1 ft != 1 yd
     */
    @Test
    public void given1FeetAnd1YardWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
     * TC 1.13 for comparing lengths 3: 1 in != 1 yd
     */
    @Test
    public void given1InchAnd1YardWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
     * TC 1.14 for comparing lengths 4: 1 yd = 36 in
     */
    @Test
    public void given1YardAnd36InchWhenCompared_shouldReturnTrue() {
        double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 36.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}








