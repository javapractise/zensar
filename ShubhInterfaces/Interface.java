//Implement Interface

import java.util*;
import java.util.lang;

public interface Employees {
	String name="Priti";
	int age=27;
	void print()
	}

class Person implements Employees {
	public void print() {
		System.out.println("xyz");
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.print();
	}
}