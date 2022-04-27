
class Rectangle{
	int length;
	int breadth;

	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public int area()
	{
		return this.length*this.breadth;
	}

	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(4, 5);
		System.out.println("Area for (4,5) is "+r1.area());

		Rectangle r2 = new Rectangle(5, 8);
		System.out.println("Area for (5,8) is "+r2.area());
	}
} 