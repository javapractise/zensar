import java.util.*;
import java.util.stream.*;
public class MaxiStream 
{
    public static void main(String args[]) 
	{
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,100,32,15);
            int max =  myList.stream()
            .max(Integer::compare)
             .get();
            System.out.println(max);                    
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac MaxiStream.java

C:\Users\SC67784\repo\SAMPLE>java MaxiStream.java
100