package wrapper;

import java.util.LinkedList;

public class producerconsumer {
	public static void main(String[] args)
	        throws InterruptedException
	    {
	       
	        final project p1 = new project();
	 
	        
	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run()
	            {
	                try {
	                    p1.produce();
	                }
	                catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	 
	        
	        Thread t2 = new Thread(new Runnable() {
	            @Override
	            public void run()
	            {
	                try {
	                    p1.consume();
	                }
	                catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	 
	        
	        t1.start();
	        t2.start();
	 
	       
	        t1.join();
	        t2.join();
	    }
	 
	   
	    public static class project {
	 
	      
	        LinkedList<Integer> list = new LinkedList<>();
	        int limit =1;
	 
	      
	        public void produce() throws InterruptedException
	        {
	            int value = 0;
	            while (true) {
	                synchronized (this)
	                {
	                   
	                    while (list.size() == limit)
	                        wait();
	 
	                    System.out.println("produced-"
	                                       + value);
	 
	                    
	                    list.add(value++);
	 
	                   
	                    notify();
	 
	                    
	                    Thread.sleep(1000);
	                }
	            }
	        }
	 
	      
	        public void consume() throws InterruptedException
	        {
	            while (true) {
	                synchronized (this)
	                {
	                  
	                    while (list.size() == 0)
	                        wait();
	 
	                    
	                    int val = list.removeFirst();
	 
	                    System.out.println("consumed-"
	                                       + val);
	 
	                   
	                    notify();
	 
	                   
	                    Thread.sleep(1000);
	                }
	            }
	        }
	    }
	}