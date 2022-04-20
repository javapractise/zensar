class  Parentclass
{

	public void Parentclassmethod()
	{
	
                    System.out.println ("this is parent class");
	}
}

class  Childclass extends Parentclass
{
	public void Childclassmethod()
	{
	
	System.out.println ("this is child class");
	}
}

class  Test
{
	 public static void main(String args[])
	 {
      	   Parentclass p = new Parentclass();
	Childclass q = new Childclass();
	p.Parentclassmethod();
	q.Childclassmethod();
	q.Parentclassmethod();
	}

       	
      
			
	
}
