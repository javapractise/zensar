class Vehicles {
	public void print() {
		System.out.println("This is vehicle class");
	}
}

class Car extends Vehicles {
	@Override
	public void print() {
		System.out.println("This is car class");
	}
}

class MethodOverriding {
	public static void main(String[] args) {

		// create an object of Java class
		Car c = new Car();
		c.print();

		// create an object of Language class
		Vehicles v = new Vehicles();
		v.print();
	}
}