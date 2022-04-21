package com.java.pra.intterface;

public interface Mobile {
	void  model();
	
}
class AppleIphone implements Mobile
{
	

	@Override
	public void model() {
	System.out.println("Apple Model =Iphone13");
	}
	
}
class SamsungS20 implements Mobile
{

	@Override
	public void model() {
		System.out.println("samsung model S20");
		
	}
	
	
}


