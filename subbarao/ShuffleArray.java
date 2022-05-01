import java.util.*; 


public class ShuffleArray  {  
    public static void main(String[] args) {  
        List<String> list = Arrays.asList("S", "U", "B", "B");  
            System.out.println("List before Shuffle : "+list);  
            Collections.shuffle(list);  
            System.out.println("List after shuffle : "+list);  
          }  
}