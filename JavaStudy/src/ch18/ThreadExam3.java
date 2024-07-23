package ch18;

public class ThreadExam3 extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        System.out.println(i * 10 + "퍼센트 완료");
        sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
