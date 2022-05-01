import java.util.*;
class failsafeex{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList al=new CopyOnWriteArrayList();
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            String s= (String)itr.next();
            System.out.println(s);
            al.add("krishna");
        }
    }
}