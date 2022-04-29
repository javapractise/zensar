//failsfast
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class search {

	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("babu", "hemanth");
		cityCode.put("kumar", "naveen");
		cityCode.put("kesava", "chenna");

		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));
		}
}
}
