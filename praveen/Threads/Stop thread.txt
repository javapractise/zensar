package thread;

public class StopThread extends Thread {
	static Thread t;

	public void run() {
		System.out.println("Thread is running");
		t.stop();
		System.out.println("Learn Java step by step");
	}

	public static void main(String[] args) {
		StopThread k = new StopThread();
		t = new Thread(k);
		t.start();
	}
}