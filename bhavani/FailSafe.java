import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FailSafe
{
public static void main(String args[])
{
CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<Integer>(new Integer[] {1,3,4,5});
Iterator itr=list.iterator();

while(itr.hasNext())
{
Integer no = (Integer)itr.next();
System.out.println(no);
if(no==8)
list.add(14);
}
}
}