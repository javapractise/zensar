
public class employee2 implements Runnable {
	public void run()
	{
		System.out.println("is running");
	}
	public static void main(String[] args)
	{
		employee2 e=new employee2();
		Thread t1=new Thread();
		t1.start();
		e.run();
	}

}
