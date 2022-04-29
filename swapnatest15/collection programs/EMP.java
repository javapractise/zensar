class Emp
{
    
    private Integer id;
    private String name;
    
    public Emp(Integer id, String name)
	{
        this.id = id;
        this.name = name;
		
    }
}
 
public  PrintHashMap
{
 
    public static void main(String[] args) 
	{
        
        HashMap<Integer, Emp> hMapNumbers = new HashMap<Integer, Emp>();
        hMapNumbers.put(84, new Emp(84, "swapna"));
        hMapNumbers.put(89, new Emp(89, "gopi"));
    
        System.out.println( hMapNumbers );
        
    }
}