import java.util.LinkedList;
import java.util.Iterator;

  public class IterArrayList {
  public static void main(String[] args) {

     LinkedList<String> l_list = new LinkedList<String>();

          l_list.add("Red");
          l_list.add("Yellow");
          l_list.add("Blue");
          l_list.add("White");
          l_list.add("Green");
// set Iterator at specified index
   Iterator p = l_list.listIterator(1);
   // print list from second position
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}
