import java.util.LinkedList;
import java.util.Iterator;


  public class LastOccurence {
  public static void main(String[] args) {

     LinkedList<String> l_list = new LinkedList<String>();

          l_list.add("Blue");
          l_list.add("Green");
          l_list.add("Yellow");
          l_list.add("Pink");
          l_list.add("White");


   System.out.println("Original linked list:" + l_list);  


    Object first_element = l_list.getFirst();
    System.out.println("First Element is: "+first_element);


    Object last_element = l_list.getLast();
    System.out.println("Last Element is: "+last_element);
 }
}