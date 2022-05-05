package timeDateApi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date2);

		Period period = Period.between(date2, date1);
		System.out.println("Period: " + period);
	}
}
