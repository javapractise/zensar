

package jbds;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class DurationExample
{
public static void main(String args[])
{
Duration oneHours=Duration.ofHours(1);
System.out.println(oneHours.getSeconds() +"seconds");
Duration oneHours2=Duration.of(1,ChronoUnit.HOURS);
System.out.println(oneHours2.getSeconds() +"seconds");

LocalDateTime oldDate =LocalDateTime.of(1982,Month.AUGUST,31,10,2,6);
LocalDateTime newDate =LocalDateTime.of(2016,Month.NOVEMBER,9,10,21,23);
System.out.println(oldDate);
System.out.println(newDate);
Duration duration=Duration.between(oldDate,newDate);
System.out.println(duaration.getSeconds() +"secounds");
}
}