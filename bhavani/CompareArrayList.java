import java.util.*;
public class CompareArrayList
{
public static void main(String args[])
{
ArrayList<Integer>i1=new ArrayList<Integer>();
i1.add(22);
i1.add(26);
i1.add(27);
i1.add(28);
System.out.println(i1);
List<Integer>i2=new ArrayList<Integer>();
i2.add(22);
i2.add(26);
i2.add(27);
i2.add(28);
System.out.println(i2);
boolean value=i1.equals(i2);
System.out.println(value);

}
}