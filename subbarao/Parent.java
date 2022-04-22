class Parent {
	public void greet() {
		System.out.println("It is a parent class.");
	}
}

class Child extends Parent {
	public void message() {
		System.out.println("It is a child class");
	}
}

public class Question1 {

	public static void main(String[] args) {

		// creating object for parent class
		Parent srinivas = new Parent();

		// creating object for child class
		Child akhil = new Child();

		// calling parent class method with parent object
		srinivas.greet();

		// calling child class method with child object
		akhil.message();

		// calling parent class method with child object
		akhil.greet();



	}

}