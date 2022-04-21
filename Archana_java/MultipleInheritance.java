interface Polygon{
	public void Area(int l,int b);
}
interface Square{
	public void Perimeter(int l,int b);
}
class Rectangle implements Polygon,Square{
	public void Area(int l,int b){
		System.out.println("The area of Rectangle:"+(l*b));
	}
	public void Perimeter(int l,int b){
		System.out.println("The perimeter of rectangle is :"+2*(l+b));
	}
}

public class MultipleInheritance {
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		r.Area(4,5);
		r.Perimeter(3,5);
	}

}
