package teporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class tempopraldate {

	public static void main(String[] args) {
		tempopraldate obj=new tempopraldate();
		obj.dates();
		

	}
	
	public void dates() {
		LocalDate date=LocalDate.now();
		System.out.println("present date"+date);
		System.out.println("first day of week is :"+date.with(DayOfWeek.SUNDAY));
		System.out.println(date);
		LocalDate date1 = LocalDate.now();

		LocalDate nextThursday = date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("Next thursday: "+ nextThursday);


		LocalDate previousThursday = date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println("Last Thursday: "+ previousThursday);

		LocalDate lastDayInMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of month: "+ lastDayInMonth);


		LocalDate firstDayInMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of month: "+ firstDayInMonth);

		
		LocalDate firstDayInNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month: "+ firstDayInNextMonth);

		

		LocalDate firstDayInNextYear = date.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("First day of next year: "+ firstDayInNextYear);

		

		LocalDate lastDayInYear = date.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last day of year: "+ lastDayInYear);


		
		
	}

}