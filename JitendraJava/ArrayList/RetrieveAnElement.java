package javaprogram;
import java.util.ArrayList;
import java.util.List;
public class RetrieveAnElement {
   public static void main(String args[]) throws Exception {
      List aList = new ArrayList();
      aList.add("James");
      aList.add("George");
      aList.add("Bruce");
      aList.add("Susan");
      aList.add("Martha");
      System.out.println("The element at index 3 in the ArrayList is: " + aList.get(3));
   }
}