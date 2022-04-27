package training10;

public class SetPriorityThread extends Thread {
	
	public void run() {
		System.out.println("Thread prirority is: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		SetPriorityThread t1 = new SetPriorityThread();
		SetPriorityThread t2 = new SetPriorityThread();
		SetPriorityThread t3 = new SetPriorityThread();
		SetPriorityThread t4 = new SetPriorityThread();
		
		// Max priority thread
		t1.setPriority(MAX_PRIORITY);
		
		// Normal priority thread
		t2.setPriority(NORM_PRIORITY);
		
		// Min priority thread
		t3.setPriority(MIN_PRIORITY);
		
		// Default priority thread
		t4.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
