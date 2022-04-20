package com.java.inherience;

public class SqureArea {

	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle(2, 4);
		rectangle.area();
		rectangle.perimeter();
		
		Squre squre = new Squre(4,6);
		squre.area();
		squre.perimeter();
		Squre[] a = new Squre[10];
		int k = 5;
		for(int i = 0;i<10;i++)
			
		{
			a[i] = new Squre(k);
		k++;
		}
		for(int i = 0;i<10;i++)
		{a[i].area();
		a[i].perimeter();
		}
		}
}

class Rectangle {
	int length;
	int breadth;
	int area;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		area = length * breadth;
		System.out.println(area);

	}

	public void perimeter() {
		int perimeter = 2 * (length + breadth);

		System.out.println(perimeter);
	}

}

class Squre extends Rectangle {
	int s;

	public Squre(int length, int breadth, int s) {
		super(length, breadth);
		this.s = s;
	}

	public Squre(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	public Squre(int k) {
		// TODO Auto-generated constructor stub
	}

}

}
