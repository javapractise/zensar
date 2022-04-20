package com.zensar.inheritance;

public class ParentNew {
	private void print1() {
		System.out.println("This is a parent class");
	}
}

class ChildNew extends ParentNew {
	public void print2() {
		System.out.println("This is a child class");
	}
}

class TestNew {
	public static void main(String[] args) {
		ParentNew p = new ParentNew();
		p.print1();
		ChildNew c = new ChildNew();
		c.print2();
		c.print1();
	}
}
