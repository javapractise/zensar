import java.util.*;
 class ShuffelArray
{
	public static void main(String[] args) 
	{
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("swapna");
		list_Strings.add("shalini");
		list_Strings.add("roja");
		list_Strings.add("vijji");
		list_Strings.add("susmitha");
		System.out.println("List before shuffling:\n" + list_Strings);  
		Collections.shuffle(list_Strings);
		System.out.println("List after shuffling:\n" + list_Strings); 
 }
}
//
C:\Users\SC67784\repo\SAMPLE>java ShuffelArray.java
List before shuffling:
[swapna, shalini, roja, vijji, susmitha]
List after shuffling:
[swapna, shalini, vijji, roja, susmitha]