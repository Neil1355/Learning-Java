package MyThread;

class NewThread1 implements Runnable {
	String name;
	Thread t;
	
   NewThread1(String threadname) {
	   name = threadname ;
	   t = new Thread(this, name) ;
	   System.out.println("New Thread: "+t);
   }
   
   public void run() {
	   try {
		   for(int i=5; i>0;i--) {
			   System.out.println(name+": "+i);
			   Thread.sleep(1000);
		   }
	   }catch (InterruptedException e) {
		   System.out.println(name+" interrupted.");
	   }
	   System.out.println(name+" exiting.");
   }
}
public class DemoJoin {
	public static void main(String[] args) {
		NewThread1 nt1 = new NewThread1("one");
		NewThread1 nt2 = new NewThread1("two");
		NewThread1 nt3 = new NewThread1("three");
		
	      nt1.t.start();
	      nt2.t.start();
	      nt3.t.start();
	      
	    System.out.println("Thread 1 is alive: "+nt1.t.isAlive());
	    System.out.println("Thread 2 is alive: "+nt2.t.isAlive());
	    System.out.println("Thread 3 is alive: "+nt3.t.isAlive());
	    
	   try {
		   System.out.println("Waiting for threads to finish.");
		    nt1.t.join();
		    nt2.t.join();
		    nt3.t.join();
	   } catch(InterruptedException e) {
		   System.out.println("Main Thread interrupted.");
	   }
           System.out.println("Thread 1 is alive: "+nt1.t.isAlive());
           System.out.println("Thread 2 is alive: "+nt2.t.isAlive());
           System.out.println("Thread 3 is alive: "+nt3.t.isAlive());
           
           System.out.println("Main thread existing.");
	
	}
}