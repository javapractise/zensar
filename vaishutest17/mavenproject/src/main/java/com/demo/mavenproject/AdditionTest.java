package com.demo.mavenproject;

import static org.junit.Assert.*;

import org.junit.Test;



public class AdditionTest {

	private int actual;

	@Test
	
	public void test() {
		Addition  a =new Addition ();
		
		int actual = a.sum(10,20);
		int expected=30;
		assertEquals(expected, actual);
	}

}


