package com.zensar.interfaces;

public interface Electronics {
	void laptop();
}

class Laptop implements Electronics {

	public void laptop() {
		System.out.println("Laptops are more handy than desktop computers");
	}
}

class Test {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.laptop();
	}
}