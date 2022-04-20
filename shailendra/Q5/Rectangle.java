package com.java.inh.Q5;
public class Rectangle {
	
	
	int length;
	int breadth;
	int area;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		area =length*breadth;
		System.out.println(area);
		 
	}
	 public void perimeter()
	 {
		int perimeter = 2*(length+breadth);
		 
		System.out.println(perimeter);
	 }
	 

	
}