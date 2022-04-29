import java.util.*;  
class cloneelement{
int n;
    public static void main(String[] args)
    {
        ArrayList<Integer>  al =new ArrayList<Integer>();
        al.add(21);
        al.add(12);
        al.add(9);
        al.add(32);
        al.add(2);
        al.add(-1);
@SuppressWarnings("unchecked")
	ArrayList<Integer> l1 =(ArrayList<Integer>)al.clone();
	l1.add(29);
        l1.add(100);
	Iterator itr = l1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
}
        
    }
}