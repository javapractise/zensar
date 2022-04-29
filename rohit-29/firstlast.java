import java.util.*;  
class firstlast{
int n;
    public static void main(String[] args)
    {
        LinkedList<Integer>  al =new LinkedList<Integer>();
        al.add(21);
        al.add(12);
        al.add(9);
        al.add(32);
        al.add(2);
        al.add(-1);
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("first element"+al.getFirst());
	System.out.println("last element"+al.getLast());
        
    }
}