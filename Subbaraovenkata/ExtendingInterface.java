package training4;

interface Vehicle {

	public void getPrint();
}

interface Car extends Vehicle {

	public void getCarName(String name);
}


public class ExtendingInterfaces implements Car {

	public void getPrint() {
		System.out.println("This is vehicle interface");
	}

	public void getCarName(String name) {
		System.out.println("This is a " + name + " car");
	}

	public static void main(String[] args) {

		ExtendingInterfaces e = new ExtendingInterfaces();

		e.getPrint();
		e.getCarName("Benz");
	}

}