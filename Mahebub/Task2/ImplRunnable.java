package lambdaExpression;

public class ImplRunnable {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("Thread1 Running");
		};
		r.run();
	}
}
