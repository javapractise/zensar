package training13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingExample {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();

		System.out.println("Default Date & Time: "+ dt);
		System.out.println("---------------");

		// Pattern - 1
		DateTimeFormatter pattern_1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Format - 1: "+ dt.format(pattern_1));
		System.out.println("---------------");

		// Pattern - 2
		DateTimeFormatter pattern_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Format - 2: "+ dt.format(pattern_2));
		System.out.println("---------------");

		// Pattern - 3
		DateTimeFormatter pattern_3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		System.out.println("Format - 3: "+ dt.format(pattern_3));
		System.out.println("---------------");

		// Pattern - 3
		DateTimeFormatter pattern_4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		System.out.println("Format - 4: "+ dt.format(pattern_4));
		System.out.println("---------------");
	}

}