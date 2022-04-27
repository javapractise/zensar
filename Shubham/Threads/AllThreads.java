import java.io.*;
import java.lang.*;
import java.util.*;

class AllThreads extends Thread {

	public void run()
	{
		System.out.println("Overridden Run Method");
	}
}

public class Demo {

	public static void main(String[] args)
	{
		AllThreads t1 = new AllThreads ();
		AllThreads t2 = new AllThreads ();
		t1.start(); 
		t2.start();

		Set<Thread> threadSet
			= Thread.getAllStackTraces().keySet();
		
		for (Thread x : threadSet) {
			System.out.println(x.getName());
		}
	}
}
 