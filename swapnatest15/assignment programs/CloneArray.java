import java.util.ArrayList;
import java.util.Collections;
 class CloneArray
  {
	public static void main(String[] args) 
	{
          ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original array list: " + c1);
          ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
          System.out.println("Cloned array list: " + newc1);       
	}
}
//
C:\Users\SC67784\repo\SAMPLE>javac CloneArray.java

C:\Users\SC67784\repo\SAMPLE>java CloneArray.java
Original array list: [Red, Green, Black, White, Pink]
Cloned array list: [Red, Green, Black, White, Pink]