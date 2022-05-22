
import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args)
	{
		ArrayList<Integer> l1= new ArrayList<>();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		l1.add(19);
		l1.forEach((i)->{
			System.out.println(i);
		});
	}

}
