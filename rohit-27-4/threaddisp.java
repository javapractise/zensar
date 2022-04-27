
import java.lang.*;
 
class threaddisp extends Thread {

    public void run()
    {
        System.out.println("Inside run method");
    }

    public static void main(String[] args)
    {
        
        threaddisp t1 = new threaddisp();
        threaddisp t2 = new threaddisp();
      
        System.out.println("t1 thread priority : "+ t1.getPriority());
 
        System.out.println("t2 thread priority : " + t2.getPriority());
  
        t1.setPriority(2);
        t2.setPriority(5);

        System.out.println("t1 thread priority : "+ t1.getPriority());
 
 
        System.out.println("t2 thread priority : "+ t2.getPriority());

	ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
      	int threadcount = currentGroup.activeCount();
      	Thread[] lstThreads = new Thread[threadcount];
 
       
        for(int i=0;i<threadcount;i++)
{
 System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
}
    }
}