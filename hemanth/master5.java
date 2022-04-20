package practice;
public class shape {

	public static void main(String[] args) {
		
		method();

	}
	static void method()
	{
		System.out.println("this is this is shape");
	}

}



package practice;

public class rectangle extends shape{

	public static void main(String[] args) {
		method1();

	}
	static void method1()
	{
		System.out.println("this is rectangular shape");
	}

}





package practice;

public class circle extends shape{

	public static void main(String[] args) {
		square sc=new square();
		sc.method();
		sc.method1();
		method2();

	}
	static void method2()
	{
		System.out.println("this is circular shape");
	}

}





package practice;

public class square extends rectangle{

	public static void main(String[] args) {
		method4();

	}
	static void method4()
	{
		System.out.println("square is a rectangle");
	}

}
