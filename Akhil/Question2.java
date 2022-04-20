package training2;

class Parent2 {
	private void greet() {
		System.out.println("It is a parent class.");
	}
}

class Child2 extends Parent2 {
	public void message() {
		System.out.println("It is a child class");
	}
}

public class Question2 {

	public static void main(String[] args) {
		
		// creating object for parent class
		Parent2 srinivas = new Parent2();
		
		// creating object for child class
		Child2 akhil = new Child2();
		
		// calling parent class method with parent object
		srinivas.greet();
		
		// calling child class method with child object
		akhil.message();
		
		// calling parent class method with child object
		akhil.greet();
		
		

	}

}
