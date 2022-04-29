package javaprogram;
import java.util.*;
public class CopyArrayList {
 public static void main (String[] args) {
      List<String> zoo = new ArrayList<String>();
      zoo.add("Zebra");
      zoo.add("Lion");
      zoo.add("Tiger");
      List<String> list = new ArrayList<String>();
      list.add("Hello");
      list.add("Hi");
      list.add("World");
      Collections.copy(list,zoo); // copying the ArrayList zoo to the ArrayList list
      System.out.println(list);
   }
}