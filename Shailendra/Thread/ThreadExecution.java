package com.java.thread;

 class Thread1 extends Thread{
String msg ="";


	public Thread1(String msg) {
	super();
	this.msg = msg;
}

	@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			try
			{
				while(true)
				{
					System.out.println(msg);
					Thread.sleep(500);
				}
			}
				catch (Exception e) {
					// TODO: handle exception
				}
			
		}
}
	class Thread2 extends Thread
	{
		String msg ="";


		public Thread2(String msg) {
		super();
		this.msg = msg;
	}
		@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				try
				{
					while(true)
					{
						System.out.println(msg);
						Thread.sleep(900);
					}
				}
					catch (Exception e) {
						// TODO: handle exception
					}
				
			}
	}
	public class ThreadExecution
	{
	public static void main(String[] args) {
		Thread1 thread1 =new Thread1("thread1 ");
		Thread2 thread2 =new Thread2("thread2");
		thread1.start();
		thread2.start();

	}

}
