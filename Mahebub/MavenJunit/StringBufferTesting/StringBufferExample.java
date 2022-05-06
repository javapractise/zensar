package com.testing.StringBufferTesting;

public class StringBufferExample {
	public boolean stringBuff(StringBuffer sbOne, StringBuffer sbTwo) {
		sbTwo = sbOne;
		if (sbTwo == sbOne) {
			return true;
		}
		return false;
	}
}
