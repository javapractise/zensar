class RunningThread extends Thread
{
      public static void main(String[] args)
      {
            System.out.println("Main methods");
            RunningThread  obj = new RunningThread();
            obj.setName("\nThreadName ");
            obj.start();

            ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
            int numThreads = currentGroup.activeCount();
            Thread[] lstThreads = new Thread[numThreads];
            currentGroup.enumerate(lstThreads);
            
            for (int i =1;i< numThreads ; i++)
            {
                  System.out.println("Number of thread: "+i + "  " + lstThreads[i].getName());
            }
			
            Thread currentThread = Thread.currentThread();
            System.out.println("Current running thread: "+currentThread);
      }
}
///
C:\Users\SC67784\repo\SAMPLE>javac RunningThread.java

C:\Users\SC67784\repo\SAMPLE>java RunningThread.java
Main methods
Number of thread: 1
ThreadName
Current running thread: Thread[main,5,main]