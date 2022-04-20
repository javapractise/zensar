package practice2;
class Rectangle{
	int length,breadth;
	public Rectangle(int breadth,int length){
		this.breadth=breadth;
		this.length=length;
	}
		void Area(){
		System.out.println("Area of is:" +breadth*length);
	}
	void Perimeter(){
		System.out.println("Perimeter is"+2*(breadth+length));
	}
}
 class Square extends Rectangle{
	Square(int side){
		super(side,side);
		
	}
}
public class Five {
	public static void main(String args[]){
		Rectangle r=new Rectangle(10,4);
		r.Area();
		r.Perimeter();
		Square s=new Square(5);
		s.Area();
		s.Perimeter();
		int i,k=1;
		Square[] a=new Square[10];
		for(i=0;i<=10;i++){
			a[i]=new Square(k);
			k++;
		}
		for(i=0;i<=10;i++){
			a[i].Area();
			a[i].Perimeter();
		}
		
	}
}
