package com.zensar.interfaces;

public interface WashingMachine {
	void type();
	
	static void automatic() {
		System.out.println("Automatic washing machine takes less effort.");
	}
}

class Automatic implements WashingMachine {

	public void type() {
		System.out.println("There are manual and automatic washing machines.");
	}
}

class Test5 {
	public static void main(String[] args) {
		 WashingMachine g = new Automatic();
		g.type();
		WashingMachine.automatic();
	}
}