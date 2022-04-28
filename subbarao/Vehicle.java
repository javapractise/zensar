package nestedclass;

class Vehicle {
	interface Bike {
		void drive();
	}
}

class NestedInterface implements Vehicle.Bike {
	public void drive() {
		System.out.println("Bike Driving");
	}

	public static void main(String args[]) {
		Vehicle.Bike b = new NestedInterface();
		b.drive();
	}
} 