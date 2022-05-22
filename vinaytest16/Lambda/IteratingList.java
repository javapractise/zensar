package vinaytest16;
import java.util.List;
import java.util.ArrayList;
public class IteratingList {
		public static void main(String[] argv) {
			List<Object> names = new ArrayList<>();
			names.add("Cathy");
			names.add("Dinesh");
			names.add("Tom");
			
			/* Iterate without using Lambda
			 Iterator iterator = names.iterator();
			 while (iterator.hasNext()) {
				System.out.println(iterator.next());
			 } 
			*/ 
			names.forEach(name->System.out.println(name));
		}
	}