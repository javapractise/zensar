import java.util.*;  
class replace2nd{
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
	Iterator itr = al.iterator();
	System.out.println("before replace");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	al.set(1,22);		
	System.out.println("after replace");
	itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
        
    }
}