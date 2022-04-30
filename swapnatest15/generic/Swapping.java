import java.util.ArrayList;
import java.util.Collections;
 
public class Swapping
{
 
    public static void main(String a[])
    {
	
        ArrayList<String> ArrList = new ArrayList<String>();
        ArrList.add("swapna");
        ArrList.add("sunitha");
        ArrList.add("suresh");
        ArrList.add("gopi");
        ArrList.add("teja");
        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
        Collections.swap(ArrList, 1, 2);
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac Swapping.java

C:\Users\SC67784\repo\SAMPLE>java Swapping.java
Before Swap the ArrayList
[swapna, sunitha, suresh, gopi, teja]
After Swap the ArrayList
[swapna, suresh, sunitha, gopi, teja]