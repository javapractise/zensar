package com.testing.MaximumNumTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumNumTest {
	int[] a = {1,2,3,4,5};
	
	@Test
	public void testMaximumNum() {
		int result = MaximumNum.maximunNum(a);
		
		assertEquals(result, 5);
	}
}
