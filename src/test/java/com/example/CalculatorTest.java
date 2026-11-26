package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void addWorks() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void subtractWorks() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void multiplyWorks() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    void divideWorks() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
