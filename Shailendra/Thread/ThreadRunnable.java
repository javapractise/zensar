package com.java.thread;

import java.util.Iterator;

public class ThreadRunnable implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main Thread ="+Thread.currentThread().getName());
		 Thread t1 = new Thread(new ThreadRunnable());
	        t1.start();

	}

	@Override
	public void run() {

        System.out.println(Thread.currentThread().getName()
                         + ", executing run() method!");
	System.out.println("Thread Run mathod");

		
	}

}
