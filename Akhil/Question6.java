package training2;

class Shape {
	
	public void printShape() {
		System.out.println("This is shape.");
	}
}

class Rectangle1 extends Shape {
	public void printRect() {
		System.out.println("This is reactangle shape.");
	}
}

class Circle extends Shape {
	public void printCircle() {
		System.out.println("This is circle shape.");
	}
}

class Square1 extends Rectangle1 {
	public void printSqure() {
		System.out.println("Square is rectangle.");
	}
}

public class Question6 {

	public static void main(String[] args) {
		
		// creating square object
		Square1 s1 = new Square1();
		
		// calling Shape and Rectangle methods with Square class object
		s1.printShape();
		s1.printRect();

	}

}
