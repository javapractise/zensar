package javavinay;
public class Four {
	int length,breadth;
	public Four(int breadth,int length){
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
 class Square extends Four{
	Square(int side){
		super(side,side);
	}
}
 class Result {
	public static void main(String args[]){
		Four r=new Four(10,4);
		r.Area();
		r.Perimeter();
		Square s=new Square(5);
		s.Area();
		s.Perimeter();
	}

}