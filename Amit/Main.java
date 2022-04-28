import java.util.LinkedList;

public class Main{
	public static void main(String[] args) throws InterruptedException
	{
		// Creat a class object who has produce() & consume()
		PC p1 = new PC();
		
		// Thread for producer
		Thread t1 = new Thread(new Runnable(){
			public void run()
			{
				try
				{
					p1.produce();
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		});

		// Thread for Consumer
		Thread t2 = new Thread(new Runnable(){
			public void run()
			{
				try
				{
					p1.consume();
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}

		});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	public static class PC 
	{
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		public void produce() throws InterruptedException
		{
			int value = 0;
			while(true)
			{
				synchronized (this)
				{
					while(list.size() == capacity)
					{	wait();	}

					System.out.println("Producer produced : "+value);

					list.add(value++);

					notify();

					Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException
		{	
			while(true)
			{	
				synchronized(this)
				{
					while(list.size() == 0)
					{	wait();	}
					
					int val = list.removeFirst();
			
					System.out.println("Consumer Consumed - "+val);

					notify();
			
					Thread.sleep(100);
				}
			}
		}
	}
}