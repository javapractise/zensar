package training7;

class Bike {
	public void displayInfo() {
		System.out.println("This is a bike class.");
	}

	class Name {

		public void displayName(String name) {
			System.out.println("This is a " + name + " bike.");
		}
	}

	class Price {

		public void displayPrice(int price) {
			System.out.println("This cost " + price);
		}
	}
}

public class InnerClass {
	
	public static void main(String[] args) {
		
		// outer class
		Bike bike = new Bike();
		
		bike.displayInfo();
		
		// inner class
		Bike.Name n = bike.new Name();
		
		n.displayName("Triumph");
		
		Bike.Price p = bike.new Price();
		
		p.displayPrice(1000000);
	}

}
