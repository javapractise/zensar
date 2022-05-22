import java.util.ArrayList;
import java.util.List;
public class ListIterator{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);

		arr.stream().forEach(elem ->System.out.println(elem));
	}
}