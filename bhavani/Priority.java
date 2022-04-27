public class Priority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
          
        Priority t1=new Priority();    
    
        t1.setPriority(Thread.MAX_PRIORITY);    
        
        t1.start();    
    }    
}  