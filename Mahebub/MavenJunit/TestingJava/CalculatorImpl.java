package com.testing.TestingJava;

public class CalculatorImpl implements Calculator {
	@Override
    public int sum(int a, int b) {
        return a + b;
    }
 
    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }
}
