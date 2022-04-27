class Thread1 extends Thread
{
	String msg = "";
	Thread1(String msg)
	{
		this.msg = msg;
	}
	public void run()
	{
		try
		{
			while (true)
			{
				System.out.println(msg);
				Thread.sleep(300);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
class Thread2 extends Thread
{
	String msg = "";
	Thread2(String msg)
	{
		this.msg = msg;
	}
	public void run()
	{
		try
		{
			while (true)
			{
				System.out.println(msg);
				Thread.sleep(400);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
class threadstop
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1("Running Thread1....");
		Thread1 t2 = new Thread1("Running Thread2....");
		t1.start();
		t2.start();
	}
}