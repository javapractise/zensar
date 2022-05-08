import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest{

	@Test
	public void test() {
		First t = new First();
		int actual = t.sum(10,20);
		int expected = 30;
		assertEquals(expected,actual);
	}

}