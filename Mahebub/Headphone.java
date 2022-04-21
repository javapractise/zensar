package com.zensar.interfaces;

public interface Headphone {
	void type();
	
	default void wireless() {
		System.out.println("Bluethooth Headphones are the wireless headphones.");
	}
}

class Bluethooth implements Headphone {

	public void type() {
		System.out.println("There are wired and wireless headphones.");
	}
}

class Test4 {
	public static void main(String[] args) {
		Bluethooth b = new Bluethooth();
		b.type();
		b.wireless();
	}
}