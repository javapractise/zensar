package Third;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringBufferTest 
{
	@Test
	public void test() {
		StringBuffer sbOne = new StringBuffer("Zensar");
	        StringBuffer sbTwo = new StringBuffer("Zensar");
	        StringBuffer stBuffer = new StringBuffer();
	        boolean b = stBuffer.StrBuff(sbOne, sbTwo);
	        assertEquals(true, b);
	    }
	}
