package training7;

class Ship {
	public void display() {
		System.out.println("Inside the Polygon class");
	}
}

class Boat {
	public void printClass() {

		// creation of anonymous class extending class Polygon
		Ship s1 = new Ship() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		s1.display();
	}
}





public class AnonymousClass {

	public static void main(String[] args) {

		Boat b = new Boat();

		b.printClass();

	}

}
