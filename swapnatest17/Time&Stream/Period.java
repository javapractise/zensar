import java .util.*;
import java.time.LocalDate;
import java.time.Month;
public class Period
 {

    public static void main(String[] args) 
	{

        System.out.println("--- Examples --- ");

        Period tenDays = Period.ofDays(10); 
        System.out.println(tenDays.getDays()); 

        Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
        System.out.println(oneYearTwoMonthsThreeDays.getYears());   
        System.out.println(oneYearTwoMonthsThreeDays.getMonths());  
        System.out.println(oneYearTwoMonthsThreeDays.getDays());    

        System.out.println("\n--- Period.between --- ");
        LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
        LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);
		System.out.println(oldDate);
        System.out.println(newDate);
        Period period = Period.between(oldDate, newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");

    }
}