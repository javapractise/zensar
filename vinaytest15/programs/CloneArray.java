package vinaytest15;
import java.util.ArrayList;
public class CloneArray {
		public static void main(String a[]){
			ArrayList<String> ArrList1= new ArrayList<String>();
			ArrList1.add("vinay");
			ArrList1.add("hani");
			ArrList1.add("deepu");
			ArrList1.add("teja");

		
			System.out.println("Original ArrayList = "+ ArrList1);

			// clone ArrayList
			ArrayList ArrList2 = (ArrayList)ArrList1.clone();

			// print ArrayList2
			System.out.println("Clone ArrayList2 = "+ ArrList2);
		}
}