import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ShuffleArray {
   public static void main (String[] args) 

      ArrayList<Integer> list = new ArrayList<Integer>();

      list.add(1);
      list.add(2);
      list.add(7);
      list.add(8);
      list.add(3);
      list.add(9);

      System.out.println("Original list : " + list);

      Collections.shuffle(list);

      System.out.println("Shuffled list : " + list);
   }
}