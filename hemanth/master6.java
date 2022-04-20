package practice;

import java.util.Scanner;

public class triangle {
	static int bre;
	static int len;
	static int hei;

	public triangle() {
		
	}

	public static void main(String[] args) {
		System.out.println(area());
		System.out.println(perimeter());
		

	}
	static int area()
	{
		Scanner sc=new Scanner(System.in);
		bre=sc.nextInt();
		hei=sc.nextInt();
		return (bre*hei)/2;
	}
	static int perimeter()
	{
		Scanner sc=new Scanner(System.in);
		bre=sc.nextInt();
		hei=sc.nextInt();
		len=sc.nextInt();
		return bre*hei*len;
	}

}
