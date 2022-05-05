package com.java.java8feature;

public class RunnableInterfaceLambda implements Runnable {

	public static void main(String[] args) {

		Runnable rr = () -> {
			System.out.println("Runable Interface Using Lembda Ex");

		};
		Thread t1 = new Thread(rr);
		t1.start();

	}

	@Override
	public void run() {
		System.out.println("Run Method");
	}
}
