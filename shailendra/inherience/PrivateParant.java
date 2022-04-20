package com.java.inherience;


private class Parant
{
	public void parantMathod()
	{
		System.out.println("This is parant class");
	}
	
}
//erro Multiple markers at this line
/*
- Illegal modifier for the class Parant; only public, abstract & final are 
		 permitted
		 */
class Child extends Parant
{
	public void childmathod() {
		System.out.println("This is child class");
	}
}

public class PrivateParant {

	public static void main(String[] args) {
		Child child =new Child();
		child.parantMathod();
		child.childmathod();
		
			
	}

}
