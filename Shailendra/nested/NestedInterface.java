package com.java.nested;

interface Outer {
	void outerMathod();

	interface inner {
		void innermathod();

		void outerMathod();

	}
}

public class NestedInterface implements Outer.inner {

	public static void main(String[] args) {
NestedInterface nestedInterface =new NestedInterface();
nestedInterface.innermathod();
nestedInterface.outerMathod();
	}

	@Override
	public void outerMathod() {
	
		
		System.out.println("outermathod");
		
	}

	@Override
	public void innermathod() {
	System.out.println("inner mathod");
		
	}

}
