package thread;

public class FibonacciReverse {

	public static void main(String[] args) {

		int n = 8;
		int a[] = new int[n];

		a[0] = 0;
		a[1] = 1;
		System.out.print("Fibonacci series: " + a[0] + " " + a[1]);
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 2] + a[i - 1];
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("Reversed Fibonacci series: ");
		for (int i = a.length - 1; i >= 0; --i) {
			System.out.print(a[i] + " ");
		}
	}
}
