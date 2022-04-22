import java.util.*;
 
class Street{
 
    
   public static int minCntFoun(int a[], int N)
    {
 
        
        int[] S = new int[N];
        for(int i=0;i<N;i++)
        {
             S[i]=-1;
        }
 
    
        int L,R;
        for (int i = 0; i < N; i++)
        {
            L = Math.max(i - a[i], 0);
            R= Math.min(i + (a[i] + 1), N);
            S[L] = Math.max(S[L], R);
                                   
        }
 
        
        int cntfount = 1;
 
        
        int idxNext = 0;
        R= S[0];
 
        
        for (int i = 0; i < N; i++)
        {
            idxNext = Math.max(idxNext, S[i]);
 
            
            if (i == R)
            {
                cntfount++;
                R = idxNext;
            }
        }
        return cntfount;
    }
 
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 1 };
        int N = a.length;
 
        System.out.print(minCntFoun(a, N));
    }
}
 