package training13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Present date: "+ date);

		System.out.println("---------------");

		LocalDate nextThursday = date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("Next thursday: "+ nextThursday);

		System.out.println("---------------");

		LocalDate previousThursday = date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println("Last Thursday: "+ previousThursday);

		System.out.println("---------------");

		LocalDate lastDayInMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of month: "+ lastDayInMonth);

		System.out.println("---------------");

		LocalDate firstDayInMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of month: "+ firstDayInMonth);

		System.out.println("---------------");

		LocalDate firstDayInNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month: "+ firstDayInNextMonth);

		System.out.println("---------------");

		LocalDate firstDayInNextYear = date.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("First day of next year: "+ firstDayInNextYear);

		System.out.println("---------------");

		LocalDate lastDayInYear = date.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last day of year: "+ lastDayInYear);



	}

}