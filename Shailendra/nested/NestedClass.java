package com.java.nested;

class OuterClass
{
	public OuterClass() {
	System.out.println("outer class");
	}
	class InnerClass
	{
		public InnerClass() {
		System.out.println("innner class");
		}
	}
}


public class NestedClass {

	public static void main(String[] args) {
		OuterClass outer =new OuterClass();
		
		OuterClass.InnerClass inner =outer.new InnerClass();
				
	}

}
