package javaprogram;
import java.util.ArrayList;

public class ReplaceElement {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("Java");
      list.add("JavaWorld");
      list.add("HelloJava");
      list.add("HelloWorld");
      System.out.println(list);
      list.set(2, "HiJava");
      System.out.println(list);
   }
}
