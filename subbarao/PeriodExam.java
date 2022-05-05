import java.time.*;  
import java.time.temporal.Temporal;

public class PeriodExam
{  
  public static void main(String[] args) 
  {  
    Period period = Period.ofDays(20);  
    Temporal temp = period.addTo(LocalDate.now());  
    System.out.println(temp);  
  }  
}  