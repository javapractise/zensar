import java.util.*;  
class reverse1{
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
	Iterator itr=al.iterator();
	System.out.println("before shuffle");
	while(itr.hasNext())
{
	System.out.println(itr.next());       
}
System.out.println("after shuffle");
Collections.reverse(al);
itr= al.iterator();
	while(itr.hasNext())
{
	System.out.println(itr.next());       
}

	       
    }
}