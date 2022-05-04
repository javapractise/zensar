interface Testing {
	void Test();

	
	default void Test1() {
		System.out.println("test1");
	}

	default void Test2() {
		System.out.println("Test2");
	}

	default void Test3() {
		System.out.println("test3");
	}
	static void StaticMethod()
	{
		System.out.println("static mathod Called");
		
	}

}

public class DefaultMethod implements Testing {

	public static void main(String[] args) {
		DefaultMethod m = new DefaultMethod();

		m.Test();
		m.Test1();
		m.Test2();
		m.Test3();
		Testing.StaticMethod();

	}

	@Override
	public void Test() {
		System.out.println("Test Method");

	}

}