import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class RemoveList
{
    public static void main(String[] args)
    {
        List<String> collection = new ArrayList<>(
                        Arrays.asList("swapna", null, "gopi", null, "teja", "", "prudhvi"));
 
        collection.removeAll(Arrays.asList("", null));
        System.out.println(collection);
    }
}

//
C:\Users\SC67784\repo\SAMPLE>javac RemoveList.java

C:\Users\SC67784\repo\SAMPLE>java RemoveList.java
[swapna, gopi, teja, prudhvi]