import java.util.*;
class sortarraylist{
    public static void main(String[] args)
    {
        ArrayList<Integer>  al =new ArrayList<Integer>();
        al.add(21);
        al.add(12);
        al.add(9);
        al.add(32);
        al.add(2);
        al.add(-1);
        
        Collections.sort(al);
        Iterator itr =al.iterator();
        System.out.println("After sorting list");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}