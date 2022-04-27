
public class ThreadRunning extends Thread{
	public static void main(String[] args)
	{
		ThreadRunning a1 = new ThreadRunning();
		a1.setName("T-1");
		a1.start();
		ThreadGroup gp = Thread.currentThread().getThreadGroup();
		int num = gp.activeCount();
		Thread[] threads = new Thread[num];
		gp.enumerate(threads);
		for(int i=0;i<num;i++)
		{
			System.out.println("Thread NUmber : "+i+" = "+threads[i].getName());
		}
	}
}	 