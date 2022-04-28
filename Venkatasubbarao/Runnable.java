import java.lang.*;
public class Runnable{
	public static void main(String[] args) 
	{
		MyRunnable mr = new MyRunnable();

        		Thread t1 = new Thread(mr);
		t1.start();

       		try
		{
            			Thread.sleep( 1000L);
        		}
		catch(Exception e)
		{
            			System.out.println("Exception is Handelled");
        		}

       		mr.doStop();
    	}
}