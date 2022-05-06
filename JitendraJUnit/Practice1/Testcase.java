package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcase {

	@Test
	public void test() {
		Addition t = new Addition();
		int actual = t.sum(10,20);
		int expected = 30;
		assertEquals(expected,actual);
	}

}
