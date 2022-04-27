import java.util.Scanner;
class Rectangle{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void printArea()
	{
		System.out.println("Area is :"+length*breadth);
	}
	public void printPerimeter()
	{
		System.out.println("Perimeter is :"+2*(length+breadth));
	}
}

class Square extends Rectangle{
	int s;
	Square(int s)
	{
		super(s,s);
	}
}

public class Fifth{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Square[] objArr = new Square[10];

		for(int i=0; i<10;i++)
		{
			System.out.println("Enter side value for "+(i+1)+" Object :");
			int side = sc.nextInt();
			objArr[i] = new Square(side);
			objArr[i].printArea();
		}

	}
}