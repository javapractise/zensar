public class RunnableDemo {
	  public static void main(String[] args) {
	    System.out.println("From main() method: " + Thread.currentThread().getName());
	    System.out.println("Creating Runnable Instance");
	    Runnable runnable = new Runnable() {
	@Override
	      public void run() {
	        System.out.println("From run() method: " + Thread.currentThread().getName());
	      }
	    };

	    System.out.println("Creating a Thread Instance");
	    Thread thread = new Thread(runnable);

	    System.out.println("Launching the thread...");
	    thread.start();
	  }
	}