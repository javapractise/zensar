package com.testing.ArrayTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayExampleTest {
	@Test
    public void JUnitArTest(){
        int[] arr = {32,52,89,12};
        ArrayExample a = new ArrayExample();
        boolean b = a.arrayLessThan(arr);
        assertEquals(false, b);
    }
}
