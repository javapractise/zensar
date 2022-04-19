

public class swap {
	public static void main(String[] args)
	{
		int a=20,b=40;
		System.out.println("before swap: " + a);
		System.out.println("before swap: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap: " + a);
		System.out.println("after swap: " + b);

	}


}
