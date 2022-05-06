package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseA {

	@Test
	public void test() {
		int[] arr = {12,42,65,36};
		ArrayJUTest a=new ArrayJUTest();
		boolean b=a.arrayLessThan(arr);
		assertEquals(false,b);
	}

}
