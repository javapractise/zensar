package com.java.inherience;

class Parant
{
	public void parantMathod()
	{
		System.out.println("This is parant class");
	}
	
}
class Child extends Parant
{
	public void childmathod() {
		System.out.println("This is child class");
	}
}

public class ParantChild {

	public static void main(String[] args) {
		Child child =new Child();
		child.parantMathod();
		child.childmathod();
		
			
	}

}
