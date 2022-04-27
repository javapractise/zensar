
import java.lang.*;
 
class threadprior extends Thread {

    public void run()
    {
        System.out.println("Inside run method");
    }

    public static void main(String[] args)
    {
        
        threadprior t1 = new threadprior();
        threadprior t2 = new threadprior();
      
        System.out.println("t1 thread priority : "+ t1.getPriority());
 
        System.out.println("t2 thread priority : " + t2.getPriority());
  
        t1.setPriority(2);
        t2.setPriority(5);

        System.out.println("t1 thread priority : "+ t1.getPriority());
 
 
        System.out.println("t2 thread priority : "+ t2.getPriority());
 
       
        
        System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
    }
}