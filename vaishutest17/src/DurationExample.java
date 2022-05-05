

import java.time.*;  
import java.time.temporal.ChronoUnit;  

public class DurationExample
{  
  public static void main(String[] args) 
  {  
    Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
    System.out.println(d.get(ChronoUnit.SECONDS));    
  }  
}  