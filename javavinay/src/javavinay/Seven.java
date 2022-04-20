package javavinay;

public class Seven {
	int a,b,c;
	double getArea(){
		double d=(a+b+c)/2.0;
		return Math.pow ((d*(d-a)*(d-b)*(d-c)),.5);
	}
	int Perimeter(){
		return(a+b+c)/2;
	}
}
class Seventh {
	public static void main(String args[]){
		Seven t=new Seven();
		t.a=3;
		t.b=4;
		t.c=5;
		System.out.println(t.getArea());
		System.out.println(t.Perimeter());
	}

}