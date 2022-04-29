import java.util.ArrayList;
import java.util.Iterator;
  
 class FailFast1
 {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
  
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) 
		{
            if (itr.next() == 2) 
			{
                
                itr.remove();
            }
        }
  
        System.out.println(al);
  
        itr = al.iterator();
        while (itr.hasNext())
		{
            if (itr.next() == 3) 
			{
                
                al.remove(3);
            }
        }
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac FailFast1.java

C:\Users\SC67784\repo\SAMPLE>java FailFast1.java
[1, 3, 4, 5]