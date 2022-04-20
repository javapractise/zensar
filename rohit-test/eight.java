
class rectangle{
	int length;
	int breadth;
	rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void area()
	{
		int area1;
		area1=length*breadth;
		System.out.println("area of rectangle:"+area1 +"," + "length:"+length+"," +"breadth:"+ breadth);
	}
}
public class eight{
	public static void main(String[] args)
	{
		rectangle r= new rectangle(4,5);
		rectangle r1= new rectangle(5,8);
		r.area();
		r1.area();
	}
}