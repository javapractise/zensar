package oops;

import java.util.Scanner;

public class rectangle {
	static int len;
	static int bre;

	public rectangle(int len, int bre) {
		super();
		this.len = len;
		this.bre = bre;
	}
	
	int area()
	{
		Scanner sc=new Scanner(System.in);
		rectangle a1=new rectangle(len, bre);
		a1.len=sc.nextInt();
		a1.bre=sc.nextInt();
		int ar=(len+bre);
		return ar;
	}
	int perimeter()
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int bre=sc.nextInt();
		int per=((2*len)+(2*bre));
		return per;
	}

}






package oops;

import java.util.Scanner;

public class square extends rectangle {

	public square(int len, int bre) {
		super(len, bre);
		
	}

	public static void main(String[] args) {
		rectangle a3=new rectangle(len, bre);
		square a4=new square(len, bre);
		System.out.println("area of a rectangle :"+a3.area());
		System.out.println("perimeter of a rectangle :"+a3.perimeter());
		for(int i=0;i<10;i++)
		{
		System.out.println("area of a square :"+a4.area());
		}
		System.out.println("perimeter of a square :"+a4.perimeter());
		
		
		

	}
	int area()
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int bre=sc.nextInt();
		return len*bre;
		
		
	}
	int perimeter()
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		
		return 4*len;
	}
	

}
