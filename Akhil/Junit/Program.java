package com.mavenpractise;

public class Program {

	public static String twoString(String strOne, String strTwo){  
		if(strOne == strTwo) {
			return "Equal";
		} else {
			return "Not Equal";
		}
	}

	public static boolean LessThan20(int arr[]) {
		for(int ele: arr) {
			if(ele < 20) {
				return false;
			}
		}
		return true;
	}

	public static boolean twoStringBuffer(StringBuffer sbOne, StringBuffer sbTwo) {
		
		boolean result = sbTwo.toString().equals(sbOne.toString());
		System.out.println(result);
		return result;
	}
	
	public static int findMaximunInArray(int arr[]) {
		int maximum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > maximum) {
				maximum = arr[i];
			}
		}
		
		return maximum;
	}

}
