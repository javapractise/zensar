

package jbds;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class PeriodExample
{
public static void main(String args[])
{
Period tendays =Period.ofDays(10);
System.out.println(tendays.getDays());
Period oneYearTwoMonthsThreeDays=Period.of(1,2,3);
System.out.println(oneYearTwoMonthsThreeDays.getYears());
System.out.println(oneYearTwoMonthsThreeDays.getMonths());
System.out.println(oneYearTwoMonthsThreeDays.getDays());
LocalDate oldDate =LocalDate.of(1982,Month.AUGUST,31);
LocalDate newDate =LocalDate.of(2016,Month.NOVEMBER,9);
System.out.println(oldDate);
System.out.println(newDate);
Period period =Period.between(oldDate,newDate);
System.out.println(period.getYears()+"years,");
System.out.println(period.getMonths()+"months,");
System.out.println(period.getDays()+"days,");
}
}