package stringprogram;

public class StringBuffer {
	 public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){

	    }

	    public boolean StringBuff(StringBuffer sbOne, StringBuffer sbTwo){
	        sbTwo = sbOne;
	        if(sbTwo==sbOne){
	            return true;
	        }

	        else{
	            return false;
	        }
	    }
	}

package stringprogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junitstringbuffer {

	@Test
	void test() {
		StringBuffer sbOne = new StringBuffer("hello");
        StringBuffer sbTwo = new StringBuffer("hello");
        StringBuffer stBuffer = new StringBuffer(null);
        boolean hel = stBuffer.StringBuff(sbOne, sbTwo);
        assertEquals(true, hel);
	}

}
