
import java.util.Arrays;
import java.util.List;

public class CountStrings
{

    public static void main(String[] args) 
	{
        List<String> arrStr = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = arrStr.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Empty Count: " + count);
    }

}
//
C:\Users\SC67784\repo\SAMPLE>javac CountStrings.java

C:\Users\SC67784\repo\SAMPLE>java CountStrings.java
Empty Count: 2
