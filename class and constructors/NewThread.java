
class NewThread implements Runnable {
	Thread t;

	NewThread() {
		t = new Thread(this, "Demo thread");
		System.out.println("Child Thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}

	public static void main(String[] args) {
		new NewThread();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// ignore
		}
	}
}
