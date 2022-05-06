import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusters { 

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate currentYear = date.with(TemporalAdjusters.firstDayOfYear());
		LocalDate nextWeek = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.MONDAY));
		LocalDate firstDayofMonth = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		LocalDate lastDayofMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		LocalDate week = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
		LocalDate nextYear = date.with(TemporalAdjusters.firstDayOfNextYear());


		System.out.println(week);

		LocalDate lastMonth = firstDayofMonth.minusMonths(1);
		LocalDate nextMonth = firstDayofMonth.plusMonths(1);
		LocalDate previouWeek = week.minusWeeks(1);
		LocalDate previousyear =currentYear.minusYears(1);
		
		System.out.println("Current Date"+date);

		System.out.println("Last Month"+lastMonth);
		System.out.println("Next Month"+nextMonth);
		System.out.println("Previous Week"+previouWeek);
		System.out.println("Next Week"+nextWeek);
		System.out.println("Current Year"+currentYear);
		System.out.println("Previous Year"+previousyear);
		System.out.println("Next Year"+nextYear);

		System.out.println("Last Month"+lastMonth);

		
	}

}