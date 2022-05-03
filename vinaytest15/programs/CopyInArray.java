package vinaytest15;

import java.util.*;

public class CopyInArray {
   public static void main (String[] args) {
      List<String> zoo = new ArrayList<String>();
      zoo.add("Dog");
      zoo.add("cat");
      zoo.add("monkey");
      List<String> list = new ArrayList<String>();
      list.add("Hello");
      list.add("Hi");
      list.add("World");
      Collections.copy(list,zoo); 
      System.out.println(list);
   }
}