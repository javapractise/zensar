package com.java.pra.intterface;


interface interfacedefault
{
	void print();
	default void defaultMathod()
	{
		System.out.println("In default mathod we can give body");
		
		
	}
	static void staticMathod()
	{
		System.out.println("static method");
		
		
	}
}
interface StaticInteface
{
	static void staticMathod()
	{
		System.out.println("static method");
		
		
	}
}
class Test implements interfacedefault,StaticInteface
{

	@Override
	public void print() {
	System.out.println("only print");
	}
	
}

public class DefaultMathodAndStatic  {

	public static void main(String[] args) {
		interfacedefault defaultMathod= new Test();
		defaultMathod.defaultMathod();
		interfacedefault.staticMathod();
		Test test =new Test();
		test.print();
		
	
		}
		
	}


