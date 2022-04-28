import java.util.io.*;
import java.util.LinkedList;

public class Product {
	LinkedList<Integer> list = new LinkedList<Integer>();
	int rang = 3;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (list.size() == rang)
					wait();
				System.out.println("produce " + value);
				list.add(value++);
				notify();
				Thread.sleep(700);
			}
		}
	}

	public void consume() throws InterruptedException {

		while (true) {
			synchronized (this) {
				while (list.size() == 0)
					wait();

				int val = list.removeFirst();

				System.out.println("Consumer consumed-" + val);

				notify();

				Thread.sleep(700);
				
			}
		}

	}

}