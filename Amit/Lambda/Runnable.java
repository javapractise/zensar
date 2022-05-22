import java.lang.*;

public class Runnable{
	public static void main(String[] args)
	{
		// Runnable using lambda
		new Thread(()-> System.out.println("!!	Runnable using Lambda Funtion	!!")).start();
	}
}