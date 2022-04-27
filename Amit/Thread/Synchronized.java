class Sender{
	public void SendMsg(String msg)
	{
		System.out.println("Sending a Message : "+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Interruption");
		}
		System.out.println("\n Message sent");
	}
}

class SenderThreads extends Thread{
	private String msg;
	Sender sd;

	SenderThreads(String m, Sender obj)
	{
		msg = m; 
		sd = obj;
	}
	public void run()
	{
		synchronized(sd)
		{
			sd.SendMsg(msg);
		}
	}
}

public class Synchronized{
	public static void main(String[] args)
	{
		Sender sender = new Sender();
		SenderThreads t1 = new SenderThreads("Hii", sender);
		SenderThreads t2 = new SenderThreads("Hello", sender);

		t1.start();
		t2.start();

		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handelled");
		}
	}
}