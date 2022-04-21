import java.util.*;

public class shape{
  System.out.println("This is Shape"); 
}
class rectangle extends shape{
  System.out.println("This is rectangular shape");
}

class square extends rectangle{
  System.out.println("Square is a rectangle"); 
}

class circle extends shape{
   System.out.println("This is circular shape");
  }

public static void main(String[] args)
{
 square s;
}