package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitStringBuffer {

	@Test
	public void test() {
		StringBuffer sbOne = new StringBuffer("hello");
	        StringBuffer sbTwo = new StringBuffer("hello");
	        StringBuffer stBuffer = new StringBuffer();
	        boolean hel = stBuffer.StringBuff(sbOne, sbTwo);
	        assertEquals(true, hel);
	    }
	}


