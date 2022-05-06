package timeDateApi;

import java.util.*;

public class GetID {
	public static void main(String args[]) {
		TimeZone id = TimeZone.getTimeZone("Asia/Kolkata");

		System.out.println("The ID is: " + id.getID());
	}
}