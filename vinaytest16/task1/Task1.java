	package vinaytest16;

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

class vinay_Task1 implements Task1 {
		public void running() {
			System.out.println("Running Smoothly");
		}

		public static void main(String[] args) {
			vinay_Task1 task = new vinay_Task1();

			task.type();
			task.running();
			Task1.color();
		}
	}

