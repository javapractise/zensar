

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
public class TemporalAdjuster

{
public static void main(String args[])
{
TemporalAdjuster tg =new TemporalAdjuster();
tg.testAdjusters();
}
public void testAdjusters()
{
LocalDate date1=LocalDate.now();
System.out.println("today date is:"+date1);
LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
LocalDate firstInYear = LocalDate.of(date1.getYear().date1.getMonth(),1);
LocalDate secoundSaturaday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
System.out.println("secound saturday is on:"+secoundSaturday);
}
}