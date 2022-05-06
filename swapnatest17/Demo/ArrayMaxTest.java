package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMaxTest {

	@Test
	public void test() {
		ArrayMax am = new ArrayMax();
		int actual = am.max();
		int expected = 550;
		assertEquals(expected, actual);
		
	}

}
