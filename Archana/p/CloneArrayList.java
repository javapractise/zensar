
import java.util.ArrayList;


public class CloneArrayList {
	public static void main(String a[]){
		ArrayList<String> ArrList1= new ArrayList<String>();
		ArrList1.add("Archana");
		ArrList1.add("Akhila");
		ArrList1.add("Anusha");
		ArrList1.add("Aradhya");

	
		System.out.println("Original ArrayList = "+ ArrList1);

		// clone ArrayList
		ArrayList ArrList2 = (ArrayList)ArrList1.clone();

		// print ArrayList2
		System.out.println("Clone ArrayList2 = "+ ArrList2);
	}
}
