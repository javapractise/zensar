package com.zensar.inheritance;

public class Rectangle {
	int length;
	int breadth;
	int result;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		result = length*breadth;
		System.out.println("Area of rectangle is: "+result);
	}
	
	public void perimeter() {
		result = 2*(length+breadth);
		System.out.println("Perimeter of rectangle is: "+result);
	}
}

class Square extends Rectangle {

	public Square(int length, int breadth) {
		super(length, breadth);
	}
	
	public void area() {
		result = length*length;
		System.out.println("Area of Square is: "+result);
	}
	
	public void perimeter() {
		result = 4*(length);
		System.out.println("Perimeter of Square is: "+result);
	}
}

class Test2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		r.area();
		r.perimeter();
		Square s = new Square(10, 10);
		s.area();
		s.perimeter();
	}
}
