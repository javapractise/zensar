package com.testing.MaximumNumTesting;

public class MaximumNum {
	public static int maximunNum(int a[]) {
		int maxNum = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxNum) {
				maxNum = a[i];
			}
		}

		return maxNum;
	}
}
