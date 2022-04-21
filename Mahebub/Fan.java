package com.zensar.interfaces;

public interface Fan {
	void tableFan();
	
	interface Ceiling {
		void ceilingFan();
	}
}

class Air implements Fan {

	public void tableFan() {
		System.out.println("Table fans are more handy.");
	}
	
	public void ceilingFan() {
		System.out.println("Ceiling Fans are used to take more air.");
	}
}

class Test6 {
	public static void main(String[] args) {
		Air a = new Air();
		a.tableFan();
		a.ceilingFan();
	}
}