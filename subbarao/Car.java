abstract class Car {
	abstract void run();
}

public class Anonymous {
	public static void main(String args[]) {
		Car c = new Car() {
			void run() {
				System.out.println("runs with fast speed");
			}
		};
		c.run();
	}
}
