public class MyRunnableMain {
	public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
	Thread t = new Thread(m);
	t.start();
	try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        m.doStop();
    }
}