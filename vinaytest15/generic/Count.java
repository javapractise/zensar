package vinaytest15;
	import java.util.Collection;

	public class Count {
		public final class Algorithm {
		    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

		        int count = 0;
		        for (T elem : c)
		            if (p.test(elem))
		                ++count;
		        return count;
		    }
		}
	}

	interface UnaryPredicate<T> {
	    public boolean test(T obj);
	}