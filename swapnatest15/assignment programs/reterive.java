import java.util.*;
class Reterive
  {
  public static void main(String[] args)
  {
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("swapna");
  list_Strings.add("shalini");
  list_Strings.add("roja");
  list_Strings.add("vijji");
  list_Strings.add("susmitha");
  System.out.println(list_Strings);
  String element = list_Strings.get(0);
  System.out.println("First element: "+element);
  element = list_Strings.get(2);
  System.out.println("Third element: "+element);
 }
}//
C:\Users\SC67784\repo\SAMPLE>javac reterive.java

C:\Users\SC67784\repo\SAMPLE>java reterive.java
[swapna, shalini, roja, vijji, susmitha]
First element: swapna
Third element: roja
