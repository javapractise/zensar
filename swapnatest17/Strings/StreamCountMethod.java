import java.util.Arrays;
import java.util.List;
 
public class StreamCountMethod 
{
 
    public static void main(String[] args)
	{
 
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
 
        
        long count1 = numbers.stream().count();
 
       
        System.out.println("count of Numbers is = " + count1);
 
        
        List<String> sectors = Arrays.asList(
                "swapna", 
                "gopi", 
                "krishna", 
                "sss", 
                "teja"
                );
 
       
        long count3 = sectors.stream().count();
        System.out.println("count of String is = " + count3);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac StreamCountMethod.java

C:\Users\SC67784\repo\SAMPLE>java StreamCountMethod.java
count of Numbers is = 6
count of String is = 5