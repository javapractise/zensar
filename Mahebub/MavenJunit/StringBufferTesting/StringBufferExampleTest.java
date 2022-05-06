package com.testing.StringBufferTesting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringBufferExampleTest {
	@Test
	public void test() {
		StringBufferExample sbe = new StringBufferExample();
		sbe.stringBuff(new StringBuffer("Hi"), new StringBuffer("Hello"));
		
	    StringBuffer sb1 = new StringBuffer("hello");
	    StringBuffer sb2 = sb1;

	    assertTrue(sb1 == sb2);

	    sb2 = new StringBuffer("hello");
	    assertFalse(sb1 == sb2);
	}
}
