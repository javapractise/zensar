import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	Set<String > cites =new HashSet<String>();
	cites.add("Bangalore");
	cites.add("Kolkata");
	cites.add("Mumbai");
	cites.add("Chennai");
	cites.add("Bangalore");
	
	Iterator<String> itr =cites.iterator();
	// Iterator has only going forward direction (hasNext())
	while(itr.hasNext())
	{
		String citess =itr.next();
		System.out.println(citess);
	}
	
	//listitrator
	itr.
			
	}

}