package com.testing.StringTesting;

public class StringExample {
	
	public boolean strings(String strOne, String strTwo) {
		strTwo = strOne;
		if (strTwo == strOne) {
			return true;
		} else {
			return false;
		}
	}
}
