class A
{

   public static void main(String args[])
   {

	System.out.println("helloworld");
  }



}

output :

C:\Users\SC67784\repo\SAMPLE>javac hello.java

C:\Users\SC67784\repo\SAMPLE>java A
helloworld

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class hello
{
 
  public static void main(String args[]){
   
           Class A = hello.class;
           System.out.println(hello.class);

        System.out.println(String.class.getClassLoader());
    }

  }

C:\Users\SC67784\repo\SAMPLE>javac hello.java

C:\Users\SC67784\repo\SAMPLE>java hello
class hello
null