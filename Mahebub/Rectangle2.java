package com.zensar.inheritance;

public class Rectangle2 {
	int length, breadth;
	int result;
	public int area() {
		result = length * breadth;
		return result;
	}
	public Rectangle2(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}
 class test6 {
	 public static void main(String[] args) {
		Rectangle2 r2 = new Rectangle2(4,5);
		System.out.println(r2.area());
		Rectangle2 r1 = new Rectangle2(5,8);
		System.out.println(r1.area());
	}
 }