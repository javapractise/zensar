import java.util.*;

public class ReplaceInList{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		System.out.println("Enter elemenet to put in a second position : ");
		int num = sc.nextInt();
		System.out.println("List before modification : "+a);
		a.set(1, num);
		System.out.println("List after modification : "+a);
	}

}