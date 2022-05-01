import java.util.*;  
class copyelement{
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
	ArrayList<Integer> l1 =new ArrayList<Integer>();
	  l1.add(100);
        l1.add(200);
	Collections.copy(al,l1);
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
}
        
    }
}