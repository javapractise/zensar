package MySQL;

@FunctionalInterface
interface Task1 {
	// abstract method
	public void running();

	// static method
	public static void color() {
		System.out.println("green in color");
	}

	// default method
	default void type() {
		System.out.println("watermelon ");
	}
}

public class Task implements Task1 {
	public void running() {
		System.out.println("tasty");
	}

	public static void main(String[] args) {
		Task task = new Task();

		task.type();
		task.running();
		Task1.color();
	}
} 