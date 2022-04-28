public class Priority extends Thread{
	public static void main(String[] args)
	{
		Priority t1 = new Priority();
		Priority t2 = new Priority();

		t1.setPriority(2);
		t2.setPriority(4);

		t1.start();
		t2.start();
	}
	public void run()
	{
		System.out.println("Priority of thread : " +Thread.currentThread().getPriority()); 
	}
}