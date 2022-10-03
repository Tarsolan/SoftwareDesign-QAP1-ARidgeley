package com.test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.multiply(256, 382), 97_792);
    }

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.sum(5.32, 10.25), 15.57);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.subtract(10.96, 5.35), 5.61, 0.001);
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.divide(6, 2), 3);

        boolean exceptionThrown = false;

        // Attempts to divide by 0
        try {
            calculator.divide(500, 0);
        } catch (ArithmeticException error) {
            exceptionThrown = true;
        }

        Assertions.assertTrue(exceptionThrown);
    }

    @Test
    public void testTotal(){
        Calculator calculator = new Calculator();
        calculator.increaseTotal(450);

        boolean exceptionThrown = false;

        // Attempts to reduce the total below 0
        try {
            calculator.reduceTotal(500);
        } catch (NumberFormatException error) {
            exceptionThrown = true;
        }

        Assertions.assertTrue(exceptionThrown);
    }

}
