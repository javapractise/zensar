package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		addition a = new addition();
		int actual = a.sum(5, 7);
		int expected = 12;
		assertEquals(expected, actual);
	}

}
