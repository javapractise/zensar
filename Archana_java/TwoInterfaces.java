interface Polygon{
	public void Area(int l,int b);

}

interface Square extends Polygon{
	public void Perimeter(int l,int b);
	
}

class Rectangle implements Square{
	public void Area(int l,int b)
	{
		System.out.println("\nArea of polygon is:"+(l*b));
	}
	public void Perimeter(int l,int b)
	{
		System.out.println("Perimeter of Rectangle is:"+2*(l+b));
	}
	}

class TwoInterface{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.Area(8,9);
		r.Perimeter(2,4);
	}
}