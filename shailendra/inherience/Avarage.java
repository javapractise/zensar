package com.java.inherience;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) {
		int sum=0;
	Scanner sc = new Scanner(System.in);
	int[] num= new int[9];
	
	for(int i=0;i<num.length;i++)
	{
		num[i] +=	sc.nextInt();	
		
		
	}
	
	for(Integer arrysum :num)
	{
		sum += arrysum;
	}
	int avarage =sum/2;
	System.out.println("avarge of arrays"+avarage);
	for (int i = 0; i < num.length; i++) {
		
		System.out.print(num[i]);
		
	}
	

}
}
