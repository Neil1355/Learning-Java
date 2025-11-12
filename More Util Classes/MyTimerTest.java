package learning.moreutilclasses;

import java.util.*;

public class MyTimerTest extends TimerTask {
	public void run() {
		System.out.println("Timer task executed.");
	}
}

class TTest {
	public static void main(String[] args) {
		MyTimerTest myTask = new MyTimerTest();
		Timer myTimer = new Timer();
		myTimer.schedule(myTask, 1000, 500);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException exc) {
		}
		myTimer.cancel();
	}
}
