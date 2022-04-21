package practice3;
interface Polygon{
	public void Area(int l,int b);
}
class Rectangle implements Polygon{
	public void Area(int l,int b){
		System.out.println("Area of rectangle is"+(l*b));
	}
}
public class Main {
	public static void main(String args[]){
		Rectangle h=new Rectangle();
		h.Area(6,7);
	}

}
