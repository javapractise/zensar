package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBufferJunitTest
{

	@Test
	public void test()
	{
		StringBufferJunit sbj = new StringBufferJunit();
		String sbOne = "Hello";
		String sbTwo = "Hello";
		Boolean actual = sbj.StringBuff(sbOne, sbTwo) ;
		Boolean expected = true;
		assertEquals(actual, expected);

        //StringBuffer stBuffer = new StringBuffer();
        //boolean hel = stBuffer.StringBuff(sbOne, sbTwo);
        //assertEquals(true, hel);
    }


}


