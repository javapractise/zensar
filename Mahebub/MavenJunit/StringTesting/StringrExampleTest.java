package com.testing.StringTesting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringrExampleTest {
	
	@Test
	public void test() {
		StringExample se = new StringExample();
		se.strings("hello", "hello");
		
	    String s1 = new String("hello");
	    String s2 = s1;

	    assertTrue(s1 == s2);

	    s2 = new String("hello");

	    assertFalse(s1 == s2);
	}
}
