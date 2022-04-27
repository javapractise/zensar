package Threaddemo;

public class Priorityofthread extends Thread
{  
    public void run()
    {  
        System.out.println("running...");  
    }  
    public static void main(String args[])
    {  
        // creating one thread 
        Priorityofthread t1=new Priorityofthread();  
        Priorityofthread t2=new Priorityofthread();
        // set the priority
        t1.setPriority(4);
        t2.setPriority(7);
       
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //4
        System.out.println("Priority of thread t2 is: " + t2.getPriority()); //7
        // this will call the run() method
        t1.start();
    }
}
