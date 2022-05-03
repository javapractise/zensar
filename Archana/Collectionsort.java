import java.util.*;
public class Collectionsort{
	public static void main(String[] args){
        	String domains[] = {"Practice", "Geeks","Code", "Quiz"};
		List colList = new ArrayList(Arrays.asList(domains));				        
		Collections.sort(colList);
        	System.out.println("List after the use of" +" Collection.sort()  :\n" +colList);
    	}
}