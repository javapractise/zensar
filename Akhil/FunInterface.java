package training12;

@FunctionalInterface
interface Vehicle {
	
	// Abstract Method
	public void message();
	
	// Default Method
	default void brand(String brand) {
		System.out.println("Brand of the vehicle is "+ brand);
	}
	
	// Static Method
	static void color(String color) {
		System.out.println("Color of the vehicle is "+ color);
	}
}

public class FunInterface implements Vehicle {
	
	public void message() {
		System.out.println("This is a vehicle class");
	}

	public static void main(String[] args) {
		
		FunInterface f = new FunInterface();
		
		f.message();
		f.brand("Audi");
		Vehicle.color("Red");
		

	}

}
