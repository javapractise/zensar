public class GetId extends Thread
{
public void run()
{
System.out.println("thread is running");
}
public static void main(String args[])
{
GetId t1=new GetId();
System.out.println("name of t1:"+t1.getName());
System.out.println("id of t1:"+t1.getId());
t1.start();
}
}
