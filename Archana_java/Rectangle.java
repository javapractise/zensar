interface Polygon{
	public void Area(int l,int b);

	interface Square{
		public void Perimeter(int l,int b);
	}
	interface Football{
		public void footballFans();
	}
	public static void Area()
	{
		System.out.println("Area");
	}
	default void Perimeter()
	{
		System.out.println("Perimeter");
	}
}

public class Rectangle implements Polygon{
	public void Area(int l,int b)
	{
		System.out.println("Area of rectangle is:"+(l*b));
	}
	public void Perimeter(int l,int b)
	{
		System.out.println("Perimeter of rectangle is:"+2*(l+b));
	}
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		r.Area(3,5);
		r.Perimeter(7,8);
		Polygon.Area();	
		r.Perimeter();	
	}
}