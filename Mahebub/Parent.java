package com.zensar.inheritance;

public class Parent {
	public void print1() {
		System.out.println("This is a parent class");
	}
}

class Child extends Parent {
	public void print2() {
		System.out.println("This is a child class");
	}
}

class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.print1();
		Child c = new Child();
		c.print2();
		c.print1();
	}
}
