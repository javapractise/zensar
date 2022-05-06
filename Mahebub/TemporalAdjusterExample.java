package timeDateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {

    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        
        System.out.println("First day of week:: "+d.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY)));
        System.out.println("Last day of week:: "+d.with(TemporalAdjusters.dayOfWeekInMonth(-1, DayOfWeek.SUNDAY)));
        System.out.println("First day of next week:: "+d.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println("First Day of Month:: "+d.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Last day of Month:: "+d.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("First day of next month:: "+d.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("First Day of the year:: "+d.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println("Last Day of the year:: "+d.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println("First Day of next year:: "+d.with(TemporalAdjusters.firstDayOfNextYear()));
    }
}