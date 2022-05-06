package com.testing.TestingJava;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorImplTest {
	private static Calculator calculator;
	 
    @BeforeClass
    public static void initCalculator() {
        calculator = new CalculatorImpl();
    }
 
    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }
 
    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }
 
    @Test
    public void testSum() {
        int result = calculator.sum(3, 4);
 
        assertEquals(7, result);
    }
    
    @Test
    public void testSubstraction() {
        int result = calculator.subtraction(10, 5);
 
        assertEquals(result, 5);
    }
}
