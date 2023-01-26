package com.example.junittesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    
    @Test
    @DisplayName("Test add 1 + 2 = 3")
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }
    
    @Test
    @DisplayName("Test add 5 + 5 = 10")
    public void testAdd2() {
        SimpleCalculator calc = new SimpleCalculator();
        int result = calc.add(5, 5);
        assertEquals(10, result);
    }


}

// assert types:
// assertEquals - compares two objects for equality
// assertNotEquals - compares two objects for inequality
// assertTrue - checks if a condition is true
// assertFalse - checks if a condition is false
// assertNull - checks if an object is null
// assertNotNull - checks if an object is not null
// assertSame - checks if two objects refer to the same object
// assertNotSame - checks if two objects refer to different objects
// assertArrayEquals - checks if two arrays are equal to each other
// assertThrows - checks if a specific exception is thrown
// assertTimeout - checks if a method call completes within a given time limit
// assertTimeoutPreemptively - checks if a method call completes within a given time limit, but the time limit is enforced by stopping the current thread
// assertAll - checks if all the given assertions are true
// assertDoesNotThrow - checks if a method call does not throw an exception
// assertIterableEquals - checks if two iterables are equal to each other
// assertLinesMatch - checks if two lists of strings are equal to each other
// assertTimeoutPreemptively - checks if a method call completes within a given time limit, but the time limit is enforced by stopping the current thread

