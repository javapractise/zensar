package com.java.thread.consumer;



public class ConsumerProduceMain extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Product product = new Product();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					product.produce();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					product.consume();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
		});
		  // Start both threads
	
        t1.start();
        t2.start();
 
        // t1 finishes before t2
        t1.join();
        t2.join();
    

}

	

}
