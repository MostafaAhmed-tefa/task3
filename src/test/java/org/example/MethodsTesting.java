package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsTesting {

    private methods testmethod = new methods();

    @Test
    public void testAdd() {
        assertEquals(15, testmethod.add(5, 10));
        assertEquals(-5, testmethod.add(5, -10));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, testmethod.subtract(3, 2));
        assertEquals(5, testmethod.subtract(2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, testmethod.multiply(10, 5));
        assertEquals(0, testmethod.multiply(5, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, testmethod.divide(6, 3));
        assertEquals(2.5, testmethod.divide(5, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            testmethod.divide(5, 0);
        });
    }
}