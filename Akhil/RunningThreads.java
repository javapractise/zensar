package training10;

public class RunningThreads extends Thread {
	
	public static void main(String[] args) {
		
		RunningThreads t1 = new RunningThreads();
		
		t1.setName("Akhil");
		t1.start();
		
		
		ThreadGroup tg = Thread.currentThread().getThreadGroup();
		int totalThreads = tg.activeCount();
		
		Thread[] threadsArr = new Thread[totalThreads];
		
		tg.enumerate(threadsArr);
		
		System.out.println("Running Threads:");
		System.out.println("Count: " + totalThreads);
		
		for(Thread tr: threadsArr) {
			System.out.println(tr.getName());
		}
	}

}
