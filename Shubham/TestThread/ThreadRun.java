import java.util.io.*;
import java.util.Runnable;

class ThreadRun implements Runnable {
	static int fact = 1;

	public void run()
	{
		for (int i = 1; i <= 5; i++)
			fact = fact * i;
		System.out.println(fact);
	}
}

public class ThreadDemo {
	public static void main(String[] args)
	{

		Thread t1
			= new Thread(new ThreadRun());

		t1.start();
	}
}
