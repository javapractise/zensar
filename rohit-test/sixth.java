
class shape{
	void display()
	{
		System.out.println("this is a shape");
	}
}
class circle extends shape{
	void display2()
	{
		System.out.println("this is circle shape");
	}
}
class rectangle extends shape{
	void display3()
	{
		System.out.println("this is a rectangle shape");
	}
}
class squre extends rectangle{
	void display4()
	{
		System.out.println("squre is a rectangle");
	}
	
	
}
public class sixth {
	public static void main(String[] args)
	{
		squre s= new squre();
		s.display();
		s.display3();
	}

}
