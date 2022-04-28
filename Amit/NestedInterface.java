interface A{
	
	interface B{
		void show();
	}
}

public class NestedInterface implements A.B{

	
	public void show()
	{
		System.out.println("Show from interface B");
	}
	public static void main(String[] args)
	{
		
		A.B b = new NestedInterface();
		b.show();
		
	}
}