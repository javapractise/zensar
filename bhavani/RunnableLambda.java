public class RunnableLambda
{
public static void main(String args[])
{
Runnable r1= new Runnable()
{

public void run()
{
System.out.println("runnable with class");
}
};
Thread thread1=new Thread(r1);
thread1.start();
Runnable r2=()->{
System.out.println("runnable with lambda expression");
};

new Thread(r2).start();
}
}