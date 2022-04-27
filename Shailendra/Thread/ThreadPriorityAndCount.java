package com.java.thread;


public class ThreadPriorityAndCount extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" run mathod running ");
		super.run();
	}
	public static void main(String[] args) {
		ThreadPriorityAndCount t1 = new ThreadPriorityAndCount();
		ThreadPriorityAndCount t2 = new ThreadPriorityAndCount();
		t1.setPriority(1);
		t2.setPriority(5);
		System.out.println("priority "+t1.getPriority());
		System.out.println("priority "+t2.getPriority());

		t1.start();
		t2.start();
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		int Count =group.activeCount();
		
		for(int i =1;i<=Count;i++)
		{
			System.out.println(i);
		}
	}

}
