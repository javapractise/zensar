package com.zensar.inheritance;

public class Triangle {
	int s1 = 3, s2 = 4, s3 = 5;
	float r;

	public float perimeter() {
		r = (float) (s1 + s2 + s3) / 2;
		System.out.println("Perimeter of triagle is: " + r);
		return r;
	}

	public void area() {
		Triangle t = new Triangle();
		float p;
		p=t.perimeter();
		r = (float) (Math.sqrt(p*(p-s1)*(p-s2)*(p-s3)));
		System.out.println("Area of triangle is: "+r);
	}
}

class test5 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.area();
	}
}
