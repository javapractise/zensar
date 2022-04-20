package com.java.inherience;

public class Tringle {
	public static void main(String[] args) {
		
	double a=3,b=4,c=5;
     double perimeter = a + b + c;
     double s = perimeter / 2;
     double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
     
     System.out.println("Perimeter = " + perimeter);
     System.out.println("Area = " + area);

	
	}

}