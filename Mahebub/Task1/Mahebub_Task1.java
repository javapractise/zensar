package functionalinterface;

@FunctionalInterface
interface Task1 {
	// abstract method
	public void running();

	// static method
	public static void color() {
		System.out.println("The bike has colour red-black");
	}

	// default method
	default void type() {
		System.out.println("Sports Bike ");
	}
}

public class Mahebub_Task1 implements Task1 {
	public void running() {
		System.out.println("Running Smoothly");
	}

	public static void main(String[] args) {
		Mahebub_Task1 task = new Mahebub_Task1();

		task.type();
		task.running();
		Task1.color();
	}
}