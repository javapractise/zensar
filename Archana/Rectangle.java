

class R{
	int length,breadth;
	R(int l,int b){
		length=l;
		breadth=b;
	}
	int Area(){
		return length*breadth;
	}
	int perimeter(){
		return 2*(length*breadth);
	}
	
}
public class Rectangle {
	public static void main(String args[]){
		R r1=new R(4,5);
		R r2=new R(5,8);
		
		System.out.println("Area:"+r1.Area()+"  "+"Perimeter:"+r1.perimeter());
		System.out.println("Area:"+r2.Area()+"  "+"Perimeter:"+r2.perimeter());
	}


}
