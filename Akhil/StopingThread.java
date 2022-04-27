package training10;


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
				Thread.sleep(400);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

public class StopingThread {

	public static void main(String[] args) {
		
		 Thread1 t1 = new Thread1("Running Thread1....");
         t1.start();

	}

}
