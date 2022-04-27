
package training3;

class Animals {
	public void print() {
		System.out.println("This is Animlas class");
	}
}

class Dog extends Animals {
	public void print() {
		System.out.println("This is Dog class");
	}
}

class Cat extends Animals {
	public void print() {
		System.out.println("This is Cat class");
	}
}

class Tiger extends Animals {
	public void print() {
		System.out.println("This is Tiger class");
	}
}

public class polymorphism {

	public static void main(String[] args) {

		// creating objects
		Animals a = new Animals();
		Dog d = new Dog();
		Cat c = new Cat();
		Tiger t = new Tiger();

		// calling methods
		a.print();
		d.print();
		c.print();
		t.print();



	}

}