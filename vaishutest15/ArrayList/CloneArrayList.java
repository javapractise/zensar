package ArrayList;
import java.util.ArrayList;


public class CloneArrayList {

	public static void main(String a[])
	{

	
		ArrayList<String> ArrList1
			= new ArrayList<String>();

		
		ArrList1.add("Vaishnavi");
		ArrList1.add("surbhi");
		ArrList1.add("prasad");
		ArrList1.add("dhiraj");

	
		System.out.println("Original ArrayList = "
						+ ArrList1);

		// clone ArrayList
		ArrayList ArrList2
			= (ArrayList)ArrList1.clone();

		// print ArrayList2
		System.out.println("Clone ArrayList2 = "
						+ ArrList2);
	}
}
