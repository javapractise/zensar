import java.util.LinkedList;
import java.util.Iterator;
 class ListIterator
  {
		public static void main(String[] args)
		{
    
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
		Iterator p = l_list.listIterator(1);

		while (p.hasNext())
		{
			System.out.println(p.next());
		}
	}
}
///
C:\Users\SC67784\repo\SAMPLE>javac ListIterator.java

C:\Users\SC67784\repo\SAMPLE>java ListIterator.java
Green
Black
White
Pink