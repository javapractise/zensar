package com.zensar.interfaces;

public interface MultipleInheritance {
	void mobile();
}

interface MobileType {
	void type();
}

class Android implements MultipleInheritance, MobileType {

	public void mobile() {
		System.out.println("Mobile has different types of operating system.");
	}
	
public void type() {
		System.out.println("Android is the most popular mobile device.");
	}
}

class Test2 {
	public static void main(String[] args) {
		Android a = new Android();
		a.mobile();
		a.type();
	}
}