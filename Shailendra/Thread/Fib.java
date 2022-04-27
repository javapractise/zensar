package com.java.thread;

public class Fib extends Thread {
	int n1 = 0, n2 = 1, n3, i, count;

public void run()
{
	while (count++ <=10)
		{
		System.out.println(count+"th" +" Fib no: = "+n1);

		//System.out.print(n1+" "+n2);//printing 0 and 1    
	 n3=n1+n2;    
	 // System.out.println(" "+n3);    
	  n1=n2;    
	  n2=n3;  
	  try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
		
		
	}
	
}

	  public static void main(String[] args) {
		  
		  Fib fib =new Fib();
		  fib.start();
		  
		  
		 	  }
	

}
