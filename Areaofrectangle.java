package project1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Areaofrectangle {

	int length;
	int breadth;
	public Areaofrectangle(int l, int b) 
    { 
	      length = l;  
       breadth = b; 
    }

	public void printarea()
	{
		System.out.println(length*breadth);
	}
	public void printPerimeter()
	{
		System.out.println(2*(length+breadth));
	}
}
class Square1 extends  Areaofrectangle{
	
int side;
public Square1(int s)
{
super(s,s);	
}
}

class total{
	
	public static void main(String args[]) {
		
		Areaofrectangle a= new Areaofrectangle(4,5);
		a.printarea();
		a.printPerimeter();
		
		Square1 s=new Square1(4);
		s.printarea();
		s.printPerimeter();
		
		Square1[] b= new Square1[10];
		int k=5;
		for(int i=0;i<10;i++) {
		
			b[i] = new Square1(k);
			k++;
	}
		for(int i=0;i<10;i++) {
			
			b[i].printarea();
			b[i].printPerimeter();
			
	}
	
	}
}

