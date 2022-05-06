package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringcompareTest {

	@Test
	public void test() {
		Stringcompare sc = new Stringcompare();
		String s1="Swapna";  
	    String s2="Swapna";  
		Boolean actual = sc.Equals(s1,s2);
		Boolean expected = true;
		assertEquals(expected, actual);
	}

}
