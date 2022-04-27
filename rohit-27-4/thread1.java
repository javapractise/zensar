
class thread1 implements Runnable
{
 public void run()
 {
    System.out.println("This code is running in a thread");
  }
	public static void main(String[] args)
	{
		thread1 obj=new thread1();
		Thread t1= new Thread(obj);
		t1.start();
		System.out.println(t1.getState());
	}
}
