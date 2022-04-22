package com.java.stringpractice;

public class WrapperClass {
	int i;
	
	public WrapperClass(int i) {
		super();
		this.i = i;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}
	


	

	@Override
	public String toString() {
		return "WrapperClass [i=" + i + "]";
	}


	public static void main(String[] args) {
	WrapperClass wrapperClass =new WrapperClass(56);
	wrapperClass.setI(34);
	System.out.println(wrapperClass.getI());
	System.out.println(wrapperClass);
	
	

	}

}
