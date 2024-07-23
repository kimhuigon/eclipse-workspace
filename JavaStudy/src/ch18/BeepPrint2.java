package ch18;

import java.awt.Toolkit;

public class BeepPrint2 {
  public static void main(String[] args) {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    
    new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}).start();
		
    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          toolkit.beep();
          try {
            Thread.sleep(500);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    }).start();

    for (int i = 0; i < 5; i++) {
      System.out.println("실행");
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
