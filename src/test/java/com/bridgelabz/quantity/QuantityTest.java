package com.bridgelabz.quantity;

import org.junit.Test;
import org.testng.Assert;

//Test Case 1.1
public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    //TC 1.2 Null Check
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assert.assertNotEquals(null, feet);
    }
    //TC 1.3 Type Check
    @Test
    public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Assert.assertSame(feet, feet);
    }

    @Test
    public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assert.assertNotSame(feet, feet1);
    }
}



