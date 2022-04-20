class Rectangle {

	int length;
	int bredth;
	public Rectangle (int l, int b){
	 length = l;
	 bredth = b;
	 }
	 public int getArea(){
	 return length*bredth;
	 }
	 public int getperimeter(){
	 return 2*(length+bredth);
	 }
}  
class  Ans
{
	public static void main (String args[])
	{
	Rectangle a = new Rectangle(4,5);
	Rectangle b = new Rectangle(5,8);
	System.out.println("Area : "+a.getArea()+" perimeter is "+a.getperimeter());
	System.out.println("Area : "+b.getArea()+" perimeter is "+b.getperimeter());
    }
	}