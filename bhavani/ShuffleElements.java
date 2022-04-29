import java.util.*;
public class ShuffleElements
{
public static void main(String args[])
{
List<String>list=Arrays.asList("open",work","save","close");
System.out.println(list);
Collections.shuffle(list,new Random(2));
System.out.println(list);
}
}