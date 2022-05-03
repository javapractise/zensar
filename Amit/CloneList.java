import java.util.*;

public class CloneList{
	public static void main(String[] args)
	{	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		

		ArrayList b = (ArrayList)a.clone();

		System.out.println("Elements of array list A :\n"+a);
		System.out.println("Elements of array list B :\n"+b);
	}
	
}