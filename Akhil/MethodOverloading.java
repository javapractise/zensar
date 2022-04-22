package training3;

public class MethodOverloading {

	static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	static void add(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		add(5, 5);
		add(5, 1, 4);
		add(2.5, 7.5);


	}

}
