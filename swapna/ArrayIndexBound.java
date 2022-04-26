public class ArrayIndexBound 
{
    public static void main(String[] args)
    {
        int ar[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= ar.length; i++)
            System.out.println(ar[i]);
    }
}

output:

C:\Users\SC67784\repo\SAMPLE>javac ArrayIndexBound.java

C:\Users\SC67784\repo\SAMPLE>java ArrayIndexBound.java
1
2
3
4
5
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayIndexBound.main(ArrayIndexBound.java:7)