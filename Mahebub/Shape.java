package com.zensar.inheritance;

public class Shape {
	public void shape() {
		System.out.println("This is a shape");
	}
}

class Rectangle1 extends Shape {
	public void shape1() {
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape {
	public void shape2() {
		System.out.println("This is Circular shape");
	}
}

class Square1 extends Rectangle1 {
	public void shape3() {
		System.out.println("Square is a Rectangle");
	}
}

class test4 {
	public static void main(String[] args) {
		Square1 q = new Square1();
		q.shape3();
		q.shape1();
		q.shape();
		Circle c = new Circle();
		c.shape2();
	}
}