import java.util.*;
class employeeset
{
    public static void main(String[] args)
    {
        HashMap<Integer,String>  hm =new HashMap<Integer,String>();
        hm.put(1,"rohit");
        hm.put(2,"sameer");
        hm.put(3,"pavan");
        hm.put(4,"rushi");
        hm.put(5,"krishna");
        for(Map.Entry m : hm.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
    }
}