interface Games
{  
	void games();  
}  
class TestAnnonymousInner
{  
	public static void main(String args[])
	{  
		Games e = new Games(){
		
		public void games()
			{
				System.out.println("cricket");
			}  
  
		};	
		e.games();  
	}  
} 
