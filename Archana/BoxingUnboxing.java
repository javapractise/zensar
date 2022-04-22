import java.io.*;
public class BoxingUnboxing{
	public static void main(String args[]){
		int a=20;
		Integer a1=new Integer(a);//Boxing
		System.out.println("Value of a is:"+a);
		System.out.println("Value of a1 is:"+a1);
		//unboxing
		Integer u=new Integer(10);
		int u1=u;
		System.out.println("Value of u is:"+u);
		System.out.println("Value of u1 is:"+u1);
	}	
}