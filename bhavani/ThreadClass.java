public class ThreadClass implements Runnable
{
public void run()
{
System.out.println("hi");
}
public static void main(String args[])
{
ThreadClass t=new ThreadClass();
Thread t1 =new Thread(t);
t1.start();
System.out.println("thread class");
}
}