import java.util.ArrayList;


public class CloneArrayList {

	public static void main(String a[])
	{


		ArrayList<String> ArrList1
			= new ArrayList<String>();


		ArrList1.add("Subbu");
		ArrList1.add("siraj");
		ArrList1.add("pavan");
		ArrList1.add("naga");


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
