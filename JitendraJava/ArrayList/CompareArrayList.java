package javaprogram;

import java.util.ArrayList;

public class CompareArrayList {
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("Java");
      list1.add("JavaWorld");
      list1.add("HelloJava");
      list1.add("HelloWorld");
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("Java");
      list2.add("JavaWorld");
      list2.add("HelloJava");
      list2.add("HelloWorld");
      System.out.println(list2);
      System.out.println(list1.equals(list2));
}
}