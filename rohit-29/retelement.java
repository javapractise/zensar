import java.util.*;  
class retelement{
int n;
    public static void main(String[] args)
    {
        ArrayList<Integer>  al =new ArrayList<Integer>();
        al.add(21);
        al.add(12);
        al.add(9);
        al.add(32);
        al.add(2);
        al.add(-1);
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the index");
	int n=sc.nextInt();
	System.out.println(al.get(n));       
    }
}