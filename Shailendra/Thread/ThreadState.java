package com.java.thread;

public class ThreadState {

	public static void main(String[] args) {
		Thread thread =new Thread();
		thread.start();
		for (int i = 1; i < 8; i++) {
		System.out.println("thread"+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		System.out.println("Thread");

	}

}
