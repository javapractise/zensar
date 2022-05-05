package timeDateApi;

import java.util.*;

public class GetAvailableIds {
	public static void main(String args[]) {
		String[] obj = TimeZone.getAvailableIDs();
		System.out.println("All the Available Ids are: ");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}