package training4;

interface Dog1{
	public void getName(String name);

	interface Breed {
		public void getBreed(String breed);
	}

	interface Color {
		public void getColor(String color);
	}

	interface Price {
		public void price(int price);
	}
}

class Animals1 implements Dog1 {

	public void getName(String name) {
		System.out.println("Name :" + name);
	}

	public void getBreed(String breed) {
		System.out.println("Breed :" + breed);
	}

	public void getColor(String color) {
		System.out.println("Color :" + color);
	}

	public void getPrice(int price) {
		System.out.println("Price :" + price);
	}
}


public class NestedInterface {

	public static void main(String[] args) {

		Animals1 a = new Animals1();

		a.getName("Rocky");
		a.getBreed("Labardor");
		a.getColor("White");
		a.getPrice(20000);
	}

}