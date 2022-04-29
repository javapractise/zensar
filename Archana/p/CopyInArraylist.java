import java.util.*;

public class CopyInArraylist {
   public static void main (String[] args) {
      List<String> zoo = new ArrayList<String>();
      zoo.add("Zebra");
      zoo.add("Lion");
      zoo.add("Tiger");
      List<String> list = new ArrayList<String>();
      list.add("Hello");
      list.add("Hi");
      list.add("World");
      Collections.copy(list,zoo); 
      System.out.println(list);
   }
}