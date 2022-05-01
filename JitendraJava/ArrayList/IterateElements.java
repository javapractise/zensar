package javaprogram;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateElements {
   public static void main(String[] args) {
      LinkedList<String> l = new LinkedList<String>();
      l.add("jitendra");
      l.add("Ram");
      l.add("Shyam");
      l.add("Abhinav");
      l.add("Raj");
      System.out.println("The LinkedList elements are: ");
      for (Iterator i = l.iterator(); i.hasNext();) {
         System.out.println(i.next());
      }
   }
}