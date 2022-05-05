import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class RemoveEmpty
{
    public static void main(String[] args)
    {
        List<String> collection = new ArrayList<>(
                        Arrays.asList("A", null, "B", null, "C", "", "D"));
 
        collection.removeAll(Arrays.asList("", null));
        System.out.println(collection);
    }
}