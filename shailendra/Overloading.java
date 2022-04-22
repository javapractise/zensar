package com.java.practice.pra;
//example of MathofPverloading
 class MathodOverloading {
	public void sum(int a ,int b)
	{
		int sum =a+b;
		System.out.println("Sum Integer mathod callled "+sum);
	}
	public void sum(long a ,long b,long c)
	{
		long sum =a+b+c;
		System.out.println("Sum long mathod callled 3 digit sum"+sum);
	}
	public void sum(double a ,double b)
	{
		double sum =a+b;
		System.out.println("Sum double mathod callled "+sum);
	}
 }
public class Overloading
{
	public static void main(String[] args) {
	MathodOverloading mathodOverloading =new MathodOverloading();
	mathodOverloading.sum(2, 3);
	mathodOverloading.sum(3, 5, 6);
	mathodOverloading.sum(4.6, 6.4);
	}
	}


