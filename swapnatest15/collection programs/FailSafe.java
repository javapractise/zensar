import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

class FailSafe 
{
	public static void main(String args[])
	{
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 3, 6, 9, 6 });
		Iterator itr = list.iterator();
		while (itr.hasNext()) 
		{
			Integer no = (Integer)itr.next();
			System.out.println(no);
			if (no == 9)

				
				list.add(14);
		}
	}
}
//
C:\Users\SC67784\repo\SAMPLE>javac FailSafe.java

C:\Users\SC67784\repo\SAMPLE>java FailSafe.java
3
6
9
6