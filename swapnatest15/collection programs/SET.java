import java.util.*;
public class SET 
{
   
    
    public static void main(String[] args)
    {
        
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("java");
        hash_Set.add("microservices");
        hash_Set.add("batch");
        hash_Set.add("one");
        hash_Set.add("training");
        System.out.println(hash_Set);
    }
}
///
C:\Users\SC67784\repo\SAMPLE>javac SET.java

C:\Users\SC67784\repo\SAMPLE>java SET.java
[java, one, batch, training, microservices]
