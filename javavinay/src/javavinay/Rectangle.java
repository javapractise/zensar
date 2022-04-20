package javavinay;

public class Rectangle {
		int length,breadth;
		Rectangle(int l,int b){
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
class Rectangle1 {
		public static void main(String args[]){
			Rectangle r1=new Rectangle(4,5);
			Rectangle r2=new Rectangle(5,8);
			
			System.out.println("Area:"+r1.Area()+"  "+"Perimeter:"+r1.perimeter());
			System.out.println("Area:"+r2.Area()+"  "+"Perimeter:"+r2.perimeter());
		}

	}