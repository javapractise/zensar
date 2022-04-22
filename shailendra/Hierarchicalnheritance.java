package com.java.practice.pra;
//Example of Hierarchicalnheritance and mathod overriding;

class Person
{
	public String Code()
	{
		System.out.println("can code");
		return "Can Code";
	}
	public String Eat()
	{
		System.out.println("can eat food");
		return "Can Eat";
	}
	
	
}
class Programmer extends Person
{
	
}
class SoftwareEngineer extends Person
{
	
}

public class Hierarchicalnheritance {
	

	public static void main(String[] args) {
	SoftwareEngineer engineer = new SoftwareEngineer();
	System.out.println("Engineer");
	engineer.Code();
	engineer.Eat();
	Programmer programmer =new Programmer();
	System.out.println("programmer");
	programmer.Code();
	programmer.Eat();

	}

}
