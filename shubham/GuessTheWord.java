import java.util.*;
import java.util.Scanner;

public class GuessTheWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for(int i=0;i<n;i++)
        arr[i] = sc.next();
  
        int len = 0;

        ArrayList<String>  guessTheWord=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            len = arr[i].length();
            if(len%2==1)
            guessTheWord.add(arr[i]);       
        }  
        if(guessTheWord.size()==0) 
             System.out.println("Try your Luck next time");
        else 
        {
            Iterator itr=guessTheWord.iterator();
            int max=-1;
            String res="";
            while(itr.hasNext())
            {
                String temp=(String)itr.next();
                if(temp.length()>max)
                {
                    res=temp;     
                    max=temp.length(); 
                }
             }
            System.out.println(res);
        }
    }
}