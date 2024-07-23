package ch18;

public class MyThreadRunnable implements Runnable {
  @Override
  public void run() {
	  try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    /* 동작 코드 */
  }
}
