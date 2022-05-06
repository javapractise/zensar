import java.time.*;
import java.time.temporal.*;
import java.time.temporal.TemporalAdjusters;

class TemporalAdjuster{
	public static void main(String[] args)
	{
		LocalDate ldt = LocalDate.now();

		// first day of week
		System.out.println("First day of week : "+ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)));

		// first day of next week
		LocalDate current = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		Period pd = Period.ofDays(7);
		System.out.println("First Day of Next Week : "+pd.addTo(current));

		// first day of month
		 var d1 = ldt.with(TemporalAdjusters.firstDayOfMonth());
        		System.out.println("first day of month: "+d1);

		// first dy of next Month
		var d2 = ldt.with(TemporalAdjusters.firstDayOfNextMonth());
      		System.out.println("first day of next month: "+ d2);

		// First day of year
		var d3 = ldt.with(TemporalAdjusters.firstDayOfYear());					
		System.out.println("first day of year: "+d3);
	}
}