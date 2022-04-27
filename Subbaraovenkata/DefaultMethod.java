package training4;

interface Vehicles{

	public void getName();

	default void getTyres() {
		System.out.println("It has 4 tyres");
	}

}

class Cars implements Vehicles {

	public void getName() {
		System.out.println("This is a car");
	}
}

class Bike implements Vehicles {
	public void getName() {
		System.out.println("This is a bike");
	}

	public void getTyres() {
		System.out.println("It has 2 tyres");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {

		Cars c = new Cars();

		c.getName();
		c.getTyres();

		Bike b = new Bike();

		b.getName();
		b.getTyres();
	}

}