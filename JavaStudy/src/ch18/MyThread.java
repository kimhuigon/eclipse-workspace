package ch18;

public class MyThread extends Thread {
	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
  @Override
  public void run() {
	  for(int i = 1; i <= 10; i++) {
		  System.out.println(name + " " + i);
		  try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  }
  }
}
