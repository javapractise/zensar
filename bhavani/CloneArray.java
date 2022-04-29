import java.util.*;
public class CloneArray
{
public static void main(String args[])
{
ArrayList<String>i1=new ArrayList<String>();
i1.add("bhavani");
i1.add("surya");
i1.add("jinde");
i1.add("hari");
System.out.println("original array list:"+i1);
ArrayList i2=(ArrayList)i1.clone();
System.out.println("clone arraylist2:"+i2);

}
}