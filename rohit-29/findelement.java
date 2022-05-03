import java.util.*;  
class findelement{
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
        Iterator itr =al.iterator();
        
            if(al.contains(5))
		{
			System.out.println("the element is preasent in list");
		}
else
{
System.out.println("the element is not preasent in list");
}
    }
}