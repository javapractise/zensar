package com.java.thread;

public class ThreadStateExample implements Runnable{
static 	Thread t1;
	static ThreadState objectState;
	public static void main(String[] args) {
		
ThreadStateExample example=new ThreadStateExample();
example.run();

	}

	@Override
	public void run() {
	
	System.out.println("thread in run using interface runnable");
			t1.setPriority(1);
	}

}
