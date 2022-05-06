package com.java.problem;

import java.util.Scanner;

public class ToysCodeTest  {

	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int array = sc.nextInt();
			int prices[] = new int[array];
			for (int i = 0; i < array; i++)
				prices[i] = sc.nextInt();
			int money = sc.nextInt();
			int sum = 0;
			int count = 0;
			int max = 0;
			for (int i = 0; i < prices.length; i++) {
				sum = count = 0;
				for (int j = i; j < prices.length; j++) {
					if ((sum + prices[j]) <= money) {
						sum = sum + prices[j];
						count = count + 1;
						max = Math.max(count, max);
					} else {
						count = 0;
						sum = 0;
						break;
					}
				}
			}
			System.out.println(max);
		}
	}

}
