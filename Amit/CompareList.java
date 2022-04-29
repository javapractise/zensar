import java.util.*;

public class CompareList{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		// List a and List b are same
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		// List c is different
		ArrayList<Integer> c= new ArrayList<Integer>();
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		System.out.println(a.equals(b));
		if(a.equals(b))
		{	System.out.println("List a and List b are equals");	}
		else
		{	System.out.println("List a and List b are not equals");	}
		if(a.equals(c))
		{	System.out.println("List a and List c are equals");	}
		else
		{	System.out.println("List a and List c are not equals");	}
	}
	
}