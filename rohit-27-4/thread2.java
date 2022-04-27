class thread2 extends Thread{
public void run()
{
	System.out.println("thread run");
}
public static void main(String[] args)
{
thread2 t2= new thread2();
t2.start();

}
}