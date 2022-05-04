public class MapLambdaTest{
	public static void main(String[] args) {
        	Map<Character, Runnable> map = new HashMap<>();

      		map.put('h', () -> System.out.println("Type h or q"));   
      		map.put('q', () -> System.exit(0));    

      		while(true) {
         		System.out.println("Menu");
         		System.out.println("h) Help");
         		System.out.println("q) Quit");
         		char key = new Scanner(System.in).nextLine().charAt(0);
         		if(map.containsKey(key))
            		map.get(key).run();
      		}
   	}
}