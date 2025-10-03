package MyThread;

public class SuspendResumeDemo {

       static class PausableThread extends Thread {
              private volatile boolean paused = false;

              public PausableThread(String name) {
                     super(name);
              }

              public void setPaused(boolean p) {
                     synchronized (this) {
                            paused = p;
                            if (!paused) notifyAll();
                     }
              }

              private void checkPause() {
                     synchronized (this) {
                            while (paused) {
                                   try {
                                          wait();
                                   } catch (InterruptedException e) {
                                          Thread.currentThread().interrupt();
                                          break;
                                   }
                            }
                     }
              }

              @Override
              public void run() {
                     System.out.println(getName() + " has started.");
                     for (int i = 0; i < 5; i++) {
                            checkPause();
                            try {
                                   Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                   Thread.currentThread().interrupt();
                                   break;
                            }
                            System.out.println("i=" + i + " ,ThreadName=" + getName());
                     }
                     System.out.println(getName() + " has ENDED.");
              }
       }

       public static void main(String[] args) throws InterruptedException {
              PausableThread thread1 = new PausableThread("Thread-1");
              PausableThread thread2 = new PausableThread("Thread-2");

              thread1.start();
              Thread.sleep(10);
              thread2.start();

              // Pause thread1 safely
              thread1.setPaused(true);
              Thread.sleep(1000);
              // Resume thread1
              thread1.setPaused(false);
       }
}