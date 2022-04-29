import java.util.*;

public class CopyArrayInList {
   public static void main (String[] args) {
      List<String> zoo = new ArrayList<String>();
      zoo.add("Elephant");
      zoo.add("Lion");
      zoo.add("Tiger");
      List<String> list = new ArrayList<String>();
      list.add("Hi");
      list.add("Hello");
      list.add("World");
      Collections.copy(list,zoo); 
      System.out.println(list);
   }
} 