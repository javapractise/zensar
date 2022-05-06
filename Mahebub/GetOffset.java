package timeDateApi;

import java.util.*;

public class GetOffset {
	public static void main(String args[]) {
		TimeZone obj = TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("Offset value: " + obj.getOffset(1, 2018, 2, 2, 2, 300));
	}
}