
class rectangle {
	int length;
	int bredth;
	rectangle(int l, int b)
	{
		length=l;
		bredth=b;
	}
	void area()
	{
		System.out.println("Area of rectangle:"+length*bredth);
	}
	void peremeter()
	{
		int per= 2*(length + bredth);
		System.out.println("peremeter of rectangle:"+ per);
	}
}
class square extends rectangle{
	square(int length) {
		super(length, length);
	}
	void area1()
	{
		System.out.println("Area of squre:"+ (length * length));
	}
	void peremeter1()
	{
		int per= 4*length;
		System.out.println("peremeter of squre:"+ per);
	}
}
public class fourth
{
	public static void main(String[] args)
	{
		rectangle r= new rectangle(10,20);
		square s= new square(5);
		r.area();
		r.peremeter();
		s.area1();
		s.peremeter1();
	}

}
