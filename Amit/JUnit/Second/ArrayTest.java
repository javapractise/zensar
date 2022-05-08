package Second;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		int[] arr = {12,42,65,36};
		boolean b= Array.arrayLessThan(arr);
		assertEquals(false,b);
	}
}
